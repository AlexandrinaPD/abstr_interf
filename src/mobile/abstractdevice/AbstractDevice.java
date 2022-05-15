package mobile.abstractdevice;

public abstract class AbstractDevice {

    private String name;
    private String serialNumber;


    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void powerOn();

    public abstract void powerOff();
}
