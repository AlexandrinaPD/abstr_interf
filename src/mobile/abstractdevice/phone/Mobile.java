package mobile.abstractdevice.phone;

public class Mobile extends Phone {

    public int simCount;
    public double display;
    public Mobile mob;


    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    @Override
    public void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");

    }

    @Override
    public void powerOff() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается.");

    }

    @Override
    public void call() {
        System.out.println("Выбираем контакт из меню, звоним.");

    }

}
