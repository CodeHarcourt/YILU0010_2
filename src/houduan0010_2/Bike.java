package houduan0010_2;

public class Bike implements Vehicle {
    private String bikeName;

    public Bike() {
    }

    public Bike(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    @Override
    public void start() {
        System.out.println("开始骑"+bikeName);
    }

    @Override
    public void stop() {
        System.out.println("停放"+bikeName);
    }
}
