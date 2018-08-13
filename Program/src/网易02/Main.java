package 网易02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("请输入测试组数：");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if(T<1||T>10){
            System.out.println("测试组数输入有误！");
            return;
        }else{
            //循环接收输入数据
            for(int i=0;i<T;i++){
                int m = sc.nextInt();
                int n = sc.nextInt();
//                System.out.println(m);
//                System.out.println(n);
                //建立字符型二维数组存储字符迷阵
                char[][] ss = new char[m][n];
                for(int j=0;j<m;j++){
                    ss[j]=sc.next().toCharArray();
                }
                //得到要寻找的单词
                String word = sc.next();

                //测试输出
//                for(int k=0;k<n;k++){
//                    for(int l = 0;l<m;l++){
//                        System.out.print(ss[k][l]);
//                    }
//                    System.out.println();
//                }
//                System.out.println(str);
                int count=0;
                //遍历二维数组，得到字符矩阵
                int len=word.length();
                for(int j=0;j<m;j++){
                    for(int k =0;k<n;k++){
                        //首先判断横方向上
                        if(n-k-len>=0){
                            String str="";
                            for(int x=0;x<len;x++){
                                str+=ss[j][k+x];
                            }
                            if(word.equals(str)){
                                count++;
                            }
                        }
                        //然后判断竖方向上
                        if(m-j-len>=0){
                            String str="";
                            for (int x = 0; x <len ; x++) {
                                str+=ss[j+x][k];
                            }
                            if(word.equals(str)){
                                count++;
                            }
                        }
                        //最后判断斜方向上
                        if(n-k-len>=0&&m-j-len>=0){
                            String str="";
                            for (int x = 0; x <len ; x++) {
                                str+=ss[j+x][k+x];
                            }
                            if(word.equals(str)){
                                count++;
                            }
                        }
                    }

                }
                System.out.println(count);



            }
        }


    }//mian方法
}//Main类
