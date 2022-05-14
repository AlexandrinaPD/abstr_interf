package Mobile.abstractdevice;

public abstract class AbstractDevice {

    public String name;
    public String serialNumber;

    public AbstractDevice() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void powerOn();

    public abstract void powerOff();
}
