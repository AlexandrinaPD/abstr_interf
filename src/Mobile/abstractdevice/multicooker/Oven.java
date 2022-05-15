package Mobile.abstractdevice.multicooker;

public class Oven extends Multiсooker {


    @Override
    public void cook() {
        if (isOn()) {
            System.out.println("Ставим блюдо в печь. Включаем тумблер. Готовим.");
        }

    }

    public void initTimer(int time) {
        if (isOn()) {
            System.out.println("Таймер установлен на " + time + " минут.");
        }
    }
}
