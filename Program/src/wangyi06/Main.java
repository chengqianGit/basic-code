package wangyi06;
import jdk.nashorn.api.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
给定一个表达式，该表达式由以下规则生成：
1. "0"和"1"是合法表达式；
2. 如果x和y是合法表达式，那么"(x|y)"和"(x&y)"都是合法表达式
其中，|和&分别是与运算符和或运算符。

给定一个合法表达式，求该表达式最终的值。
如果可以修改这个表达式的操作符：将|修改为&，将&修改为|，求最少需要修改多少个操作符可以修改表达式最终的值？

输入描述:
    第一行是一个正整数T（T <= 20）。接下来T行，每一行是一个表达式。表达式不含空格，
    且输入保证该表达式是一个合法表达式。   对于30%的数据，表达式的长度不超过500; 对于100%的数据，表达式的长度不超过150000
输出描述：
    T行，每一行包含两个整数x, y，用空格隔开，分别表示表达式的值，
    以及最少需要修改多少个操作符可以修改表达式的值。如果无法通过修改操作符修改表达式的值，则y输出-1
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //sc.nextLine不能放到.nextInt之后
        for (int i = 0; i <T ; i++) {
            String str = sc.next();
            //System.out.print(str);
        }
    }

    //建立树结构
    public class BinTree {
        private BinTree lChild;//左孩子
        private BinTree rChild;//右孩子
        private BinTree root;//根节点
        private Object data; //数据域
        private List<BinTree> datas;//存储所有的节点
        public BinTree(BinTree lChild, BinTree rChild, Object data) {
            super();
            this.lChild = lChild;
            this.rChild = rChild;
            this.data = data;
        }
        public BinTree(Object data) {
            this(null, null, data);
        }
        public BinTree() {
            super();
        }
        //得到所有的节点
        public void createTree(Object[] objs){
            datas=new ArrayList<BinTree>();
            for (Object object : objs) {
                datas.add(new BinTree(object));
            }
            root=datas.get(0);//将第一个作为根节点
            for (int i = 0; i < objs.length/2; i++) {
                datas.get(i).lChild=datas.get(i*2+1);
                if(i*2+2<datas.size()){//避免偶数的时候 下标越界
                    datas.get(i).rChild=datas.get(i*2+2);
                }
            }
        }
        //先序遍历
        public void preorder(BinTree root){
            if(root!=null){
                visit(root.getData());
                preorder(root.lChild);
                preorder(root.rChild);
            }

        }
        //中序遍历
        public void inorder(BinTree root){
            if(root!=null){
                inorder(root.lChild);
                visit(root.getData());
                inorder(root.rChild);
            }

        }
        //后序遍历
        public void afterorder(BinTree root){
            if(root!=null){
                afterorder(root.lChild);
                afterorder(root.rChild);
                visit(root.getData());
            }

        }
        private void visit(Object obj) {
            System.out.print(obj+" ");
        }
        public Object getData() {
            return data;
        }


        public BinTree getRoot() {
            return root;
        }

    }

}
