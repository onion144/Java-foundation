package Homework;

import java.util.ArrayList;

/**
 * @author:Administrator
 * @date: 2019/5/8
 * @description:
 */
public class Fibonacci {
    public static int get(int n) {
        //定义数列
        ArrayList fibon = new ArrayList();
        fibon.add(0,1);
        fibon.add(1,1);
        if(n<=2){
            return 1;
        }
        //递归
        return get(n-1)+get(n-2);

//        for(int i=2; i<n; i++){
//            int a = (int)(fibon.get(i-1));
//            int b = (int)(fibon.get(i-2));
//            fibon.add(i,(a+b));
//        }
//        return((int)fibon.get(n-1));
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.get(5));
    }
}
