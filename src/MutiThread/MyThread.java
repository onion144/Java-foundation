package MutiThread;

/**
 * @author:Administrator
 * @date: 2019/5/4
 * @description: 继承Thread的多态
 */
public class MyThread {
    public static void main(String[] args) {
        Thread c01 = new Thread01();
        Thread c02 = new Thread02();
        c01.start();
        c02.start();
    }
}
