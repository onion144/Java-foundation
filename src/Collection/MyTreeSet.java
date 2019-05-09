package Collection;

import Car.MyCar;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:Administrator
 * @date: 2019/5/1
 * @description: TreeSet 集合排序有两个方式，Comparable和Comparator
 * 1.类实现Comparable接口，重写compareTo方法
 * 2.匿名内部类，定义一个实现Comparator接口的比较器，并覆盖compare方法，并将该类对象作为实际参数传递给TreeSet集合的构造函数。
 */
public class MyTreeSet {
    public static void main(String[] args) {
        //匿名内部类,实现比较器
        Set tree = new TreeSet(new Comparator<MyCar>() {
            @Override
            public int compare(MyCar c1, MyCar c2) {
                int a =(c1.getName()).compareTo(c2.getName());
                if(a==0){
                    return (c1.ps-c2.ps);
                }
                return a;
            }
        });
        //实例对象需要实现Comparable接口，重写compareto方法
        tree.add(new MyCar("A",200));
        tree.add(new MyCar("A",100));
        tree.add(new MyCar("A",500));
        tree.add(new MyCar("D",1000));
        tree.add(new MyCar("D",1000));
        tree.add(new MyCar("E",1000));
        System.out.println(tree);
    }

}
