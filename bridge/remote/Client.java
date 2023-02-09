package headfirst.designpatterns.bridge.remote;

public class Client {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteSony.setTv("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();
    }
}
