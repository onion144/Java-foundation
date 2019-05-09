package MutiThread;

/**
 * @author:Administrator
 * @date: 2019/5/4
 * @description: 设置锁，保证无法同时访问，注意点：1.实现Runnable接口，实现类实例作为Thread对象的输入参数
 *                                                 2.synchronized (this)和方法锁代表作用一个对象
 *                                                 3.synchronized (.class)和静态方法锁作用于一个类
 *                                                 4.循环入口要在锁的前面，入口判断要在锁后面（带number要在锁内部）
 */
public class MyLock implements Runnable{

    public static void main(String[] args) {
        MyLock aa = new MyLock();
        MyLock bb = new MyLock();
        MyLock cc = new MyLock();
        Thread t1 = new Thread(aa,"s1");
        Thread t2 = new Thread(bb,"s2");
        Thread t3 = new Thread(cc,"s3");
            t1.start();
            t2.start();
            t3.start();
    }

    @Override
    public void run() {
    while (true) {
        synchronized (MyLock.class) {
            if(Ticket.number > 0) {
                System.out.print(Thread.currentThread());
                try { Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                Ticket.buy(); }
            else{ break; }
        } } }}
