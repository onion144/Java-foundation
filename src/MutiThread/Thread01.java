package MutiThread;

import java.lang.reflect.Array;

/**
 * @author:Administrator
 * @date: 2019/5/4
 * @description:
 */
public class Thread01 extends Thread{
    @Override
    public void run() {
        String[] a = {"a","b","c","d"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
