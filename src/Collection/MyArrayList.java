package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author:Administrator
 * @date: 2019/4/22
 * @description: ArrayList，通过数组实现，有序可重复，比较ArrayList和LinkedList删添查改的速度
 */
public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>(); //如果长度固定，可以定义长度
        long[] time = new long[10];

//        for(int j=0; j<10; j++) {
            for (int i = 0; i < 1000000; i++) {
                arrlist.add(i);
            }
             long t2 = System.currentTimeMillis();
            arrlist.add(10000,5);
            System.out.println(System.currentTimeMillis()-t2);
//        Date d1= new Date();
//        long start= d1.getTime();
//            long stime = System.currentTimeMillis();
//           arrlist.set(0,1);
//           arrlist.set(100,5);
//           arrlist.set(10000,100);
//           arrlist.set(1000000-1,200);
//            time[j] = System.currentTimeMillis() - stime;
//        }
//        System.out.println(Arrays.toString(time));
        //add 2ms
        //remove[0, 16, 3, 15, 15, 15, 17, 36, 32, 32]
        //indexOf[21, 15, 47, 31, 19, 46, 47, 31, 20, 32]
        //set[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    }
}
