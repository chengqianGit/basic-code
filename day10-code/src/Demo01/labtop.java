package Demo01;
/*
笔记本电脑类，使用了USB接口，具有开关机的功能
 */
public class labtop {
    public void powOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powOff(){
        System.out.println("笔记本电脑关机");
    }
    //将接口作为函数参数传递
    public void useUSB(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if(usb instanceof keyboard){
            keyboard kb = (keyboard)usb;
            kb.input();
        }
        usb.colse();
    }
}
