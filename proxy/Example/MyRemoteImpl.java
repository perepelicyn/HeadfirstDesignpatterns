package headfirst.designpatterns.proxy.Example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'Hey'";
    }

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Registry stReg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.rebind("rmi://localhost/RemoteHello",service);
            //Thread.sleep(Integer.MAX_VALUE);
        }catch (Exception e){}
    }
}
