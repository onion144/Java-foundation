package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author:Administrator
 * @date: 2019/4/26
 * @description:        //add 0ms                              LinkList快
 *                     //remove[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]   LinkedList快
 *                     //indexof[32, 31, 47, 47, 79, 109, 80, 115, 129, 156] ArrayList快
 *                     //set[1, 31, 16, 16, 15, 16, 14, 16, 15, 0] ArrayList快
 */
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();
        long[] time = new long[10];
//        for(int j=0; j<10; j++) {
            for (int i = 0; i < 1000000; i++) {
                lin.add(i);
            }
        long t3 = System.currentTimeMillis();
        lin.add(10000,5);
        System.out.println(System.currentTimeMillis()-t3);
//        Date d1= new Date();
//        long start= d1.getTime();
//            long stime = System.currentTimeMillis();
//            lin.set(0,1);
//            lin.set(100,5);
//            lin.set(10000,100);
//            lin.set(1000000-1,200);
//            time[j] = System.currentTimeMillis() - stime;
//        }
//        System.out.println(Arrays.toString(time));

    }
}
