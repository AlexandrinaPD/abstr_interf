package Mobile.abstractdevice.multicooker;

import Mobile.abstractdevice.AbstractDevice;

public abstract class Multiсooker extends AbstractDevice {


    private boolean on;

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Втыкаем вилку в розетку, печь включается.");
    }

    @Override
    public void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Печь выключается. Достаем из розетки");
        on = false;
    }

    protected abstract void cook();

    public boolean isOn() {
        return on;
    }

}
