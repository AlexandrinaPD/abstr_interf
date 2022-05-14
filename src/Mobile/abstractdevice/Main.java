package Mobile.abstractdevice;

import Mobile.abstractdevice.multicooker.Oven;
import Mobile.abstractdevice.multicooker.moolticooker.Multicooker;
import Mobile.abstractdevice.phone.DialPhone;
import Mobile.abstractdevice.phone.Mobile;
import Mobile.abstractdevice.phone.SmartPhone;

public class Main {

    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.setName("Mobilka");
        mob.setSerialNumber("FG414845dfg");
        mob.setSimCount(1);
        mob.setDisplay(5.75);
        System.out.println("Name: " + mob.name + "\n" + "Serial number: " + mob.serialNumber + "\n" + "Sim count: "
                + mob.simCount + "\n" + "Display: " + mob.display);
        mob.call();
        mob.powerOff();
        System.out.println();


        DialPhone dialPhone = new DialPhone();
        dialPhone.setName("Sumsung");
        dialPhone.setSerialNumber("SV155");
        dialPhone.setHasAnswerPhone(true);
        System.out.println("Name: "+ dialPhone.name + "\n" + "Serial number: " + dialPhone.serialNumber + "\n" +
                "Has answer phone: " + dialPhone.hasAnswerPhone);
        dialPhone.powerOn();
        dialPhone.call();
        dialPhone.autoAnswer();
        dialPhone.powerOff();
        System.out.println();



        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setSimCount(2);
        smartPhone.setDisplay(15.27);
        smartPhone.setOs("Android");
        System.out.println("Sim count: " + smartPhone.simCount + "\n" + "Display: " + smartPhone.display +
                "\n" + "OS: " + smartPhone.os);
        smartPhone.powerOn();
        smartPhone.runApp();
        smartPhone.powerOff();
        System.out.println();


        Multicooker multicooker = new Multicooker();
        multicooker.setName("Bosch");
        multicooker.setSerialNumber("FSE52");
        System.out.println("Name: " + multicooker.name + "\n" + "Serial number: " + multicooker.serialNumber);
        multicooker.powerOn();
        multicooker.switchProgram(2);
        multicooker.cook();
        multicooker.powerOff();
        System.out.println();


        Oven oven = new Oven();
        oven.setName("Pechka");
        oven.setSerialNumber("number one");
        System.out.println("Name: " + oven.name + "\n" + "Serial number: " + oven.serialNumber);
        oven.powerOn();
        oven.initTimer(25);
        oven.cook();
        oven.powerOff();


    }
}
