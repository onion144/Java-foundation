package Value;

/**
 * @author:Administrator
 * @date: 2019/4/20
 * @description: 基本数据类型的形式参数改变，不会引起实际参数改变。而引用数据类型的形式参数改变，会引起实际参数改变。而String最为特别。
 */
public class ValulePass {
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 2;
        exchang(a1,b1);
        System.out.println("基本数据类型交换");
        System.out.println(a1);  //1
        System.out.println(b1);  //2

       String a2 = "aa" ;
       String b2 = "bb";
       exchang(a2,b2);
       System.out.println("String类数据交换");
       System.out.println(a2);  //aa
       System.out.println(b2);  //bb

       Animal a3 = new Animal("dog",0);
       Animal b3 = new Animal("cat",2);
       exchang(a3,b3);
        System.out.println("引用对象类数据交换");
        System.out.println(a3.age);  //2
        System.out.println(b3.age);  //0
        System.out.println(a3.name);  //cat
        System.out.println(b3.name);  //dog
    }

    public static void exchang(int a, int b){
       int temp = a;
        a = b;
        b = temp;
    }
    public static void exchang(String a, String b){
        String temp = a;
         a = b;
         b = temp;
    }
    public static void exchang(Animal a, Animal b){
     int temp = a.age;
        a.age = b.age;
        b.age = temp;

        String temo = a.name;
        a.name = b.name;
        b.name = temo;
    }
}
