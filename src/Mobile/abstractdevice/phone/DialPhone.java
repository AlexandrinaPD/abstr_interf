package Mobile.abstractdevice.phone;

import Mobile.abstractdevice.Caller;

public class DialPhone extends Phone implements Caller {

    public boolean hasAnswerPhone;

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    @Override
    public void powerOn() {
        System.out.println("Включаем в розетку. Подключаем шнур к сети. Телефон работает.");

    }

    @Override
    public void powerOff() {
        System.out.println("Достаем из розетки. Телефон выключен.");

    }

    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");

    }

    public void autoAnswer() {
        System.out.println("Зажимаем кнопку автоответчика, надикотовываем голосовое сообщение, сохраняем. Готово.");
    }


}
