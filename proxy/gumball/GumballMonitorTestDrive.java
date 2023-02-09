package headfirst.designpatterns.proxy.gumball;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {

        String[] location = {   "rmi://santafe/gumballMachine",
                                "rmi://boulder/gumballMachine",
                                "rmi://127.0.0.1:1099/gumballMachine",
                                "gumballMachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i=0;i < location.length; i++) {
            try {
                try{
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                    monitor[i] = new GumballMonitor(machine);
                }catch (Exception e){
                    continue;
                }

                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i < monitor.length; i++) {
            if (monitor[i]!=null) monitor[i].report();
        }

    }
}
