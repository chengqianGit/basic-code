package wangyi04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
输入描述：
    每个输入数据仅包含一个测试点。 输入第一行首先给出流量记录的总条目数 N <= 100000。
    接下来N行，每行对应了一个流量记录。每条流量记录的格式为 月/日/年 时/分/秒 流量： MM/DD/YYYY hr:mi:se FLOWi
    表示该时刻流量统计软件记录下了FLOWi （0 <= FLOWi <= 10000且为整数）兆的流量。
    输入数据保证N条流量记录的时间是递增，且同一时间没有重复的流量记录。
    接下来一行给出小易查询总流量的数目M <= 100000。接下来M行，每行表示第mj次查询的起始和结束时间点。
    格式如下： MM/DD/YYYY hr:mi:se MM/DD/YYYY hr:mi:se 输入数据保证每次查询的结束时间一定不会早于起始时间。所有的输入数据均合法。
输出描述：
    输出结果包含M行，每行对应第mj次查询，每次查询的结果为包含起始和结束两个时刻的总流量。
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] record = new String[N+1][3];
        for (int i = 1; i <=N ; i++) {
            record[i][0] = sc.next();
            record[i][1] = sc.next();
            record[i][2] = sc.next();

        }
        int M = sc.nextInt();
        String[][] query = new String[M][4];
        for (int i = 0; i <M ; i++) {
            query[i][0] = sc.next();
            query[i][1] = sc.next();
            query[i][2] = sc.next();
            query[i][3] = sc.next();
        }
        Execute(record,query);


    }

    public static long getUnixTime(String str) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        long unixTime = dateFormat.parse(str).getTime()/1000;
        return unixTime;
    }
    //使用二分法和前缀和得到结果
     public static void Execute(String[][] record,String[][] query) throws ParseException {
         //System.out.println(record.length);
         int[] sum = new int[100000];
         //得到前缀和，即是该点之前且包括该点的所有数的和
         for (int i = 1; i <record.length ; i++) {
             sum[i] = sum[i-1] + Integer.parseInt(record[i][2]);
         }
         //使用二分法
//         int min = 1;//得到最小角标
//         int max = record.length-1;//得到最大角标
//         int mid = (max+min)/2;//得到中间值
//         for (int i = 0; i <query.length ; i++) {
//             String str=query[i][0]+" "+query[i][1];
//             long unixTime_q = getUnixTime(str);
//             while(unixTime_q<getUnixTime(record[mid][1]+" "+record[mid][2])){
//                 max=mid-1;
//
//             }
//         }
         //普通方法查找
         int out=0;
         for (int i = 0; i <query.length ; i++) {
             int u=-1,d=-1;
             String str = query[i][0]+" "+query[i][1];
             long unixTime_q = getUnixTime(str);
//             if(unixTime_q>getUnixTime(record[record.length-1][0]+" "+record[record.length-1][1])){
//                 //u=-2;
//                 System.out.println(0);
//                 continue;
//             }
             for (int j = 1; j <record.length ; j++) {
                 if(unixTime_q<=getUnixTime(record[j][0]+" "+record[j][1])){
                     u=j-1;
                     break;
                 }else{
                     u=-1;
                 }
             }
             str = query[i][2]+" "+query[i][3];
             unixTime_q = getUnixTime(str);
             for (int j = 1; j <record.length ; j++) {
                 if(unixTime_q<getUnixTime(record[j][0]+" "+record[j][1])){
                     d=j-1;
                     break;
                 }else if(unixTime_q==getUnixTime(record[j][0]+" "+record[j][1])){
                     d=j;
                     break;

                 }else{
                     d=record.length-1;
                 }
             }
             if(u==-1){
                 //out = sum[d];
                 System.out.println(0);
             }else{
                 out = sum[d] - sum[u];
                 System.out.println(out);
             }

         }
     }

}
