package headfirst.designpatterns.proxy.mygumbal;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements GumballMonitorInterface{
    GumballMachine gumballMachine;
    public Server(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public String report() throws RemoteException {
        String str = "==========report=============\n" + "Gumball Machine: " + gumballMachine.getLocation()+
        "\nCurrent inventory: " + gumballMachine.getCount() + " gumballs" + "\nCurrent state: " + gumballMachine.getState();
        return str;
    }

    public void start(){
        try{
            Server obj = this;
            GumballMonitorInterface stub = (GumballMonitorInterface) UnicastRemoteObject.exportObject(obj, 0);

            Registry stReg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.bind("GumballInfoStreet1",stub);


            //привяжем заглушку remote object в реестре
            //Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
            //registry.rebind("Hello", stub);

            System.err.println("Server ready");
        }catch (Exception e){
            System.err.println("Server exception: "+e.toString());
            e.printStackTrace();
        }
    }
}
