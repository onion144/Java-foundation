package SystemClass;

/**
 * @author:Administrator
 * @date: 2019/4/22
 * @description:  1.字符串存在常量池，相同的赋予同一个地址，减少储存量（new除外）   2.字符串是常量，内容不可更改，更改的是地址！！！
 */
public class DemoString {
    public static void main(java.lang.String[] args) {
        //
        java.lang.String a = "abcd";
        java.lang.String b = "abcd";
        java.lang.String c = new java.lang.String("abcd");
        java.lang.String d = "a" + "bcd";
        System.out.println(a == b);  //true
        System.out.println(a == c);  //false
        System.out.println(a == d);  //true
        // 字符串是常量，内容不可更改
        a = "0";
        System.out.println(a);   //o
        System.out.println(b);  //abcd
        System.out.println("=============================");  //abcd
        //查找字符,输出位置
        int t = b.indexOf("b");  //1
        //字符串长度
        System.out.println(b.length());  //4
        //字符串比较,忽略大小写
        boolean compare = b.equalsIgnoreCase("ABcd");
        //大小转化
        System.out.println(b.toUpperCase()); //ABCD
        //全部代替
        System.out.println(b.replace("ab","tt")); //ttcd


    }
}
