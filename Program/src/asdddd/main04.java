package asdddd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<String>  bookList=new ArrayList<>();
        List<String>  queryList=new ArrayList<>();
        for (int i = 0; i <T ; i++) {
            int N = sc.nextInt();
            String[][] strArray01 = new String[N][2];
            for (int j = 0; j <N ; j++) {
                strArray01[j][0] = sc.next();
                strArray01[j][1] = sc.next();
                String s = strArray01[j][0]+" "+strArray01[j][1];
                bookList.add(s);
            }
            int M = sc.nextInt();
            for (int j = 0; j <M ; j++) {
                queryList.add(sc.next());
            }

        }
        for (int i = 0; i <queryList.size() ; i++) {
            String str = queryList.get(i);
            boolean b = false;
            for (int j = 0; j <bookList.size() ; j++) {
                String[] ss = bookList.get(j).split(" ");
                ss[0]=ss[0].replaceAll("x","");
                //ss=ss.replaceAll();
                if(str.startsWith(ss[0])){
                    System.out.println(ss[1]);
                    b=true;
                    break;
                }
            }
            if(!b){
                System.out.println("unknown");
            }
        }
    }

}
