package headfirst.designpatterns.proxy.gumball;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive{

	public static void main(String[] args) throws RemoteException {
		GumballMachineRemote gumballMachine = null;
		int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
        	count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			//Naming.bind("//"+args[0]+"/gumballMachine",gumballMachine);
			//System.setProperty("java.rmi.server.hostname", "comp");
			//System.out.println("hello");

			//Context context = new InitialContext();
			//context.bind("rmi:gumballM",gumballMachine);

			//Naming.unbind("gumballMachine");
			LocateRegistry.createRegistry(1099);
			//Naming.rebind("rmi://localhost:1900/gumballMachine",gumballMachine);  //   "//comp/gumballMachine" - тогда rmi://
			Naming.rebind("gumballMachine",gumballMachine);  //   "//comp/gumballMachine" - тогда rmi://
		} catch (Exception e) {
			e.printStackTrace();
			//System.exit(1);
		}
/*
		GumballMonitor monitor = new GumballMonitor(gumballMachine);

 
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		monitor.report();*/
	}
}
