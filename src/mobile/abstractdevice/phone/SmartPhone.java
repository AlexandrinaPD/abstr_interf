package mobile.abstractdevice.phone;

import mobile.abstractdevice.Caller;
import mobile.abstractdevice.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

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

    @Override
    public String createMail(String chtoto) {
        System.out.println("Создаем смс: " + chtoto);
        return chtoto;
    }

    @Override
    public void sendMail(String chtoto) {
        System.out.println("Пишем: " + chtoto);

    }

    @Override
    public String editMail(String edit) {
        System.out.println("Редачим ошибки: " + edit);
        return edit;
    }

}
