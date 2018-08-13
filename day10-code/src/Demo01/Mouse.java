package Demo01;
/*
Mouse类实现了USB接口
 */
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println(" open mouse");
    }

    @Override
    public void colse() {
        System.out.println("close mouse");
    }
    public void click(){
        System.out.println("click");
    }
}
