package Demo01;

public class Main {
    public static void main(String[] args) {
        labtop lab = new labtop();
        //开机
        lab.powOn();
        //多态的写法
        USB usb = new Mouse();//向上转型
        lab.useUSB(usb);

        keyboard kb = new keyboard();
        lab.useUSB(kb);//正确写法

        //关机
        lab.powOff();
    }
}
