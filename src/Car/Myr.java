package Car;

/**
 * @author:Administrator
 * @date: 2019/5/7
 * @description:多态中成员访问特点:
 *                    A:构造方法：创建子类对象的时候,访问父类的构造方法,对父类的数据进行初始化
 *  * 		          B:成员方法：编译看左边,运行找到右边
 *                    C:成员变量：编译和运行看左边。
 * 		              D:静态方法和变量：编译和运行看左边。
 *
 * ---------------------------------

 */
public class Myr {
    public static void main(String[] args) {
        MyCar ff = new MyCar("ff",1000);
        MyCar fs = new Vehicle("Fs",2000);
        Vehicle son = new Vehicle("S",3000);
        son.getName();
        System.out.println(ff);
        System.out.println(fs);
        System.out.println(son);
      System.out.println("====================");
     fs.fly();
     son.fly();
    }
}
