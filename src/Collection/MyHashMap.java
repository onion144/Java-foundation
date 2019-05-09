package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:Administrator
 * @date: 2019/5/4
 * @description:
 */
public class MyHashMap {
    public static void main(String[] args) {
        Map mymap = new HashMap();
        mymap.put(1, "A");
        mymap.put(2, "C");
        mymap.put(3, "D");
        mymap.put(4, "D");
        mymap.put(9, "D");
        //遍历集合，方法1，keySet和加强for循环
//        Set<Integer> ss = mymap.keySet();  //单独生成key的集合
//        for(Integer a:ss){
//            System.out.print(a);
//            System.out.println(mymap.get(a));
//        }
        //迭代器使用while,使用一次it.next
//        Iterator it = mymap.keySet().iterator();
//        while (it.hasNext()) {
//            Object a = it.next();
//            System.out.print(a);
//            System.out.println(mymap.get(a));
//        }
        //方法2，使用entry, 二维集合, 指明是Map.Entry
        Set<Map.Entry> myEntry = mymap.entrySet();
////        for(Map.Entry entry:myEntry){
////            System.out.print(entry.getKey());
////            System.out.println(entry.getValue());
////        }
        //迭代器,需要强制转型
        Iterator it = myEntry.iterator();
        while (it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            System.out.print(m.getKey());
            System.out.println(m.getValue());
        }



    }



}
