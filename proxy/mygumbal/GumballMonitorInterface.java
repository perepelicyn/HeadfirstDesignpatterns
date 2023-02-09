package headfirst.designpatterns.proxy.mygumbal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMonitorInterface extends Remote {
    public String report() throws RemoteException;
}
