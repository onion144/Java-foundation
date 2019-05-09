package MutiThread;

/**
 * @author:Administrator
 * @date: 2019/5/4
 * @description:
 */
public class Thread02 extends Thread{
    @Override
    public void run() {
        int[] a = {1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
