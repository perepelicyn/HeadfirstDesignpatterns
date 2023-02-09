package headfirst.designpatterns.proxy.Example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            final Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
            //MyRemote service = (MyRemote) registry.lookup("rmi://localhost/RemoteHello");
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
            System.out.println(service.getClass().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
