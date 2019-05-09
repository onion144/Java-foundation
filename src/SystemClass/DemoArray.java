package SystemClass;

import java.util.Arrays;
import java.util.Random;

/**
 * @author:Administrator
 * @date: 2019/4/24
 * @description: 数组可以定以后长度不可变，元素可以是基本数据，String，其他任何实例对象（以该类定义），Arrays类内都是静态方法，通过Arrays.method调用
 */
public class DemoArray {
    public static void main(String[] args) {
        //定义随机数组在1-50范围
        int[] arr01 = new int[50];
        //第一种产生随机数方法,double[0.0,1.0),double类型，需要强转
//        for (int i = 0; i < 50; i++) {
//            arr01[i] = (int) (Math.random() * 50 + 1);
//        }
        //第二种产生随机数方法,可选类型[0,n)
        Random ra = new Random();
        for (int i = 0; i < 50; i++) {
            arr01[i] = ra.nextInt(51);
        }
        int[] arr02 = {8, 1, 2, 3, 4, 2};
        Arrays.sort(arr01);
        int ba = Arrays.binarySearch(arr01, 16);  //需要先排序，二分法
        System.out.println(Arrays.toString(arr02));
        System.out.println(Arrays.toString(arr01));
        System.out.println(ba);
    }
}
