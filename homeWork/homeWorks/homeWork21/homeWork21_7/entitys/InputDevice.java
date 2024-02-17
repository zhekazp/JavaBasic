package homeWorks.homeWork21.homeWork21_7.entitys;

abstract public class InputDevice {
    private String deviceName;

    public InputDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    abstract void connect();
    abstract void disconnect();
}
