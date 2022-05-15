package Mobile.abstractdevice;

import Mobile.abstractdevice.phone.DialPhone;
import Mobile.abstractdevice.phone.SmartPhone;

public class Maintwo {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.createMail("Создаем смс");
        smartPhone1.sendMail("Отправляем смс");
        smartPhone1.editMail("Редачим смс");
        System.out.println();

        DialPhone dialPhone1 = new DialPhone();
        dialPhone1.call();
        System.out.println();

        Post post = new Post();
        post.createMail("Пишем письмо");
        post.sendMail("Отправка письма");
        System.out.println();


        allSwitchOf(smartPhone1, post);
    }

    public static void allSwitchOf(MailSender... mailSenders) {
        for (int i = 0; i < mailSenders.length; i++) {
            mailSenders[i].sendMail("Письмо отправлено");

        }
    }
}
