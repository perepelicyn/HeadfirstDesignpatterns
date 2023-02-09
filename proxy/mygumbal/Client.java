package headfirst.designpatterns.proxy.mygumbal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
            GumballMonitorInterface stub = (GumballMonitorInterface) registry.lookup("GumballInfoStreet1");
            String monitorInfo = stub.report();
            System.out.println("monitorInfo: "+monitorInfo);
        }catch (Exception e) {
            System.err.println("Client exception: "+e);
            e.printStackTrace();
        }
    }

}
