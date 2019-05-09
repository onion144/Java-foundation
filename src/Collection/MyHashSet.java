package Collection;


import java.util.HashSet;
import java.util.Set;

import Car.*;

/**
 * @author:Administrator
 * @date: 2019/4/27
 * @description: 无序值唯一，自定义对象需要在该类中重写toString，equal和hashcode方法，导入一个包里所有文件用.*
 */
public class MyHashSet {


    public static void main(String[] args) {
        Set<Integer> hash = new HashSet();
        Set<MyCar> hashcar = new HashSet();
//        hash.add(9);
//        hash.add(4);
//        hash.add(40);
//        hash.add(4);
//        hash.add(10);
//        System.out.println(hash);     //[4, 5, 40, 9, 10]

        hashcar.add(new MyCar("xiaoben",3000));
        hashcar.add(new MyCar("dafeng",6000));
        hashcar.add(new MyCar("xiaoben",3000));
        hashcar.add(new MyCar("baoma",8000));
        System.out.println(hashcar);

    }

}

