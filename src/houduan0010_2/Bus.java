package houduan0010_2;

public class Bus implements Vehicle{
    private String busName;
    public Bus() {
    }

    public Bus(String busName) {
        this.busName = busName;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    @Override
    public void start() {
        System.out.println(busName+"开始发车");
    }

    @Override
    public void stop() {
        System.out.println(busName+"停了");
    }
}
