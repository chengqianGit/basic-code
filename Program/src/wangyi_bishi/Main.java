import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++){
            int N = sc.nextInt();
            int n = 0;
            int m =0;
            if(N<=5000){
                System.out.println(0);
            }else if(N<=8000){
                n = (N-5000)*3/100;
                m = (N-5000)*3%100;
                if(m>=50) n++;
                System.out.println(n);
            }else if(N<=17000){
                n=(3000*3+(N-5000-3000)*10)/100;
                m=(3000*3+(N-5000-3000)*10)%100;
                if(m>=50) n++;
                //double nn = n;
                System.out.println(n);
            }else if(N<=30000){
                n=(3000*3+9000*10+(N-5000-12000)*20)/100;
                m=(3000*3+9000*10+(N-5000-12000)*20)%100;
                if(m>=50) n++;
                System.out.println(n);
            }else if(N<=40000){
                n=(3000*3+9000*10+13000*20+(N-5000-25000)*25)/100;
                m=(3000*3+9000*10+13000*20+(N-5000-25000)*25)%100;
                if(m>=50) n++;
                System.out.println(n);
            }else if(N<=60000){
                n=(3000*3+9000*10+13000*20+10000*25+(N-5000-35000)*30)/100;
                m=(3000*3+9000*10+13000*20+10000*25+(N-5000-35000)*30)%100;
                if(m>=50) n++;
                System.out.println(n);
            }else if(N<=85000){
                n=(3000*3+9000*10+13000*20+10000*25+20000*30+(N-5000-55000)*35)/100;
                m=(3000*3+9000*10+13000*20+10000*25+20000*30+(N-5000-55000)*35)%100;
                if(m>=50) n++;
                System.out.println(n);
            }else{
                n=(3000*3+9000*10+13000*20+10000*25+20000*30+25000*35+(N-5000-80000)*45)/100;
                m=(3000*3+9000*10+13000*20+10000*25+20000*30+25000*35+(N-5000-80000)*45)%100;
                if(m>=50) n++;
                System.out.println(n);
            }
        }
    }

}
