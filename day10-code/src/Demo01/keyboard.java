package Demo01;
/*
实现了usb接口
 */
public class keyboard implements USB{
    @Override
    public void open() {
        System.out.println("open keyboard");
    }

    @Override
    public void colse() {
        System.out.println("close keyboard");
    }
    public void input(){
        System.out.println("input");
    }
}
