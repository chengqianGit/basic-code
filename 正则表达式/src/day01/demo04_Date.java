package day01;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
获取当前系统时间与格式转换
 */
public class demo04_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //大写MM表示月，小写mm表示分钟//大写HH表示24小时制，小写hh表示12小时制
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 a HH:mm:ss:SSS E");
        String systemDate = simpleDateFormat.format(date);
        System.out.println("当前系统时间为："+systemDate);
    }
}
