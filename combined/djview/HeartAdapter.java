package headfirst.designpatterns.combined.djview;

public class HeartAdapter implements BeatModelInterface{
    HeartModelInterface heartAdapter;

    public HeartAdapter(HeartModelInterface heartAdapter) {
        this.heartAdapter = heartAdapter;
    }

    @Override
    public void initialize() {}

    @Override
    public void on() { }

    @Override
    public void off() { }

    @Override
    public void setBPM(int bpm) { }

    @Override
    public int getBPM() {
        return heartAdapter.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        heartAdapter.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heartAdapter.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heartAdapter.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heartAdapter.removeObserver(o);
    }

}
