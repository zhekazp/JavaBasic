package homeWorks.homeWork21.homeWork21_7.entitys;

public class Mouse extends InputDevice{
    public Mouse(String deviceName) {
        super(deviceName);
    }

    @Override
    public void connect() {
        System.out.println(super.getDeviceName()+" is connected");
    }

    @Override
    public void disconnect() {
        System.out.println(super.getDeviceName()+" is disconnected");
    }
}
