package wangyi01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int T=0;
        T=sc.nextInt();
        if(T<=0)
            System.out.println("个数不为正，请重新输入");
        else{
            for(int n = 0;n<T;n++){
                String str = sc.next();
                strList.add(str);
            }
            System.out.println("输入结束");
        }
        fun(strList);

    }
    private static void fun(List<String> strList){
        for(int i=0;i<strList.size();i++){
            String hh,mm,ss;
            String str=strList.get(i);
            String[]strArray=str.split(":");
            if(strArray.length!=3){
                System.out.println("输入数据格式有误！");
                return;
            }
            int HH=Integer.parseInt(strArray[0]);
            int MM=Integer.parseInt(strArray[1]);
            int SS=Integer.parseInt(strArray[2]);
            //String HH=strArray[0];
            //String MM=strArray[1];
            //String SS=strArray[2];

            if(HH>23){
                HH=HH%10;
            }
            if(MM>59){
                MM=MM%10;
            }
            if(SS>59){
                SS=SS%10;
            }
            if(HH<10){
                hh="0"+Integer.toString(HH);
            }else{
                hh=Integer.toString(HH);
            }
            if(MM<10){
                mm="0"+Integer.toString(MM);
            }else{
                mm=Integer.toString(MM);
            }
            if(SS<10){
                ss="0"+Integer.toString(SS);
            }else{
                ss=Integer.toString(SS);
            }
            System.out.println(hh+":"+mm+":"+ss);
        }
    }
}
