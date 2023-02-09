package headfirst.designpatterns.bridge.remote;

public abstract class RemoteControl {
    TV tv;
    TVFactory tvFactory;

    public RemoteControl(TVFactory tvFactory) {
        this.tvFactory = tvFactory;
    }
    public void on(){this.tv.on();}
    public void off(){this.tv.off();}
    public void setChannel(int channel){this.tv.tuneChannel(channel);}
    public int getChannel(){return this.tv.getChannel();}
    public void setTv(String type){
        try{
            tv = tvFactory.getTV(type);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
