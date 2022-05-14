package Mobile.abstractdevice.multicooker.moolticooker;

import Mobile.abstractdevice.multicooker.Multiсooker;

public class Multicooker extends Multiсooker {


    @Override
    public void cook() {
        System.out.println("Вкусняха готовится");

    }

    public void switchProgram (int tumbler) {
        switch (tumbler){
            case 1 :
                System.out.println("Программа установлена на позиции 1.");
                break;
            case 2 :
                System.out.println("Программа установлена на позиции 2.");
                break;
            case 3 :
                System.out.println("Программа установлена на позиции 3.");
                break;
            case 4 :
                System.out.println("Программа установлена на позиции 4.");
                break;
            default:
                System.out.println("Не существует такой программы. Выберете другую и запустите заново.");
        }

    }
}
