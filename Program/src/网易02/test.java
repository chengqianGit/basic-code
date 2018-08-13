package 网易02;

public class test {
    public static void main(String[] args) {
        char[] ch={'a','b','c'};
        String str="";
        for(int i=0;i<ch.length;i++){
            str+=ch[i];
        }
        String s="abc";
        System.out.println(str);
        if(str.equals(s)){
            System.out.println("1111");
        }
    }
}
