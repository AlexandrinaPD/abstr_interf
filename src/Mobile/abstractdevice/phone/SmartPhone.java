package Mobile.abstractdevice.phone;

public class SmartPhone extends Mobile {

    public String os;

    public void setOs(String os) {
        this.os = os;
    }

    public void runApp() {
        System.out.println("Нажать кнопку. Приложение запустилось.");

    }

    public void simCount(int i) {
    }

    public void display(double v) {
    }
}
