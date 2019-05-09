package SystemClass;

/**
 * @author:Administrator
 * @date: 2019/4/22
 * @description: 将八种基本数据类型转为引用数据类型，默认值为null，会自动拆箱和装箱，运算规则一致，Byte Short Character 和Integer之间运算转为integer 其余转为大的
 */

public class DemoPackage {
        public static void main(String[] args) {
       Byte c = 127;
       //++运算强制转化为c的格式
        System.out.println(++c);
        Integer a = 1;
       Integer b = 1;
        System.out.println(++a);    //先加再输出 2
        System.out.println(b++);    //先输出再加 1
        System.out.println("a="+a+" b="+b);
        if(b==a++){
            System.out.println("a++ "+"先比再加");
            System.out.println("a="+a+" b="+b);
        }
        if(a==++b){
            System.out.println("++a "+"先比再加");
            System.out.println("a="+a+" b="+b);
        }
    }
}
