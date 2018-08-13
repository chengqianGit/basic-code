package wangyi05;
import java.util.Scanner;

/*
问题描述：
    https://blog.csdn.net/snowy_smile/article/details/78006343?locationNum=5&fps=1
输入描述：
  输入的第一行是一个正整数T，表示样例数。
  接下来是T个样例，每个样例的第一行是3个正整数hp, atk，cd，分别表示你的当前生命、普攻攻击力以及技能冷却时间。
  第二行是3个正整数x1, x2, x3，分别表示你的3个技能的攻击力。
  第三行是6个正整数hp1, y1, hp2, y2, hp3, y3，分别表示3个敌方英雄的血量和普攻攻击力。
  对于30%的数据，所有血量不超过500，所有技能和普攻攻击力不超过50；
  对于100%的数据，所有血量不超过50000，所有技能和普攻攻击力不超过100。技能的冷却时间1 <= cd <= 10
输出描述：
  对于每一个样例，输出一个整数，表示完成三杀后你最多还剩多少血量。如果不能完成，输出-1。
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i <T ; i++) {
            int[] myArray = new int[3];
            myArray[0] = sc.nextInt();
            myArray[1] = sc.nextInt();
            myArray[2] = sc.nextInt();
            int[] myAbility = new int[3];
            myAbility[0] = sc.nextInt();
            myAbility[1] = sc.nextInt();
            myAbility[2] = sc.nextInt();
            int[] enemyArray = new int[6];
            enemyArray[0] = sc.nextInt();
            enemyArray[1] = sc.nextInt();
            enemyArray[2] = sc.nextInt();
            enemyArray[3] = sc.nextInt();
            enemyArray[4] = sc.nextInt();
            enemyArray[5] = sc.nextInt();
            //全排列6中情况
            //1-2-3
            Execute1(myArray,myAbility,enemyArray);
        }
    }
    public static void Execute1(int[] myArray,int[] myAbility,int[] enemyArray){
        int totalAttack = enemyArray[1]+enemyArray[3]+enemyArray[5];
        int time=0;
        int cd = myArray[2];
        while(enemyArray[0]>0){


        }

    }
}
