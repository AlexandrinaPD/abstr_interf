package mobile.abstractdevice;

public interface EmailSender extends MailSender {

    @Override
    public String createMail(String chtoto);

    @Override
    public void sendMail(String chtoto);

    public String editMail(String edit);

}
