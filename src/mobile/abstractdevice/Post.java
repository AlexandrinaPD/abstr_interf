package mobile.abstractdevice;

public class Post implements MailSender {

    @Override
    public String createMail(String chtoto) {
        System.out.println("Создаем письмо: " + chtoto);
        return chtoto;
    }

    @Override
    public void sendMail(String chtoto) {
        System.out.println("Отправляем: " + chtoto);

    }
}
