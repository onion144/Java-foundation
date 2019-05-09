package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author:Administrator
 * @date: 2019/4/29
 * @description:
 */
public class Traverse {
    static char  a;
    public static void main(String[] args) {
       ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(4);
        mylist.add(2);
        mylist.add(2);
        mylist.add(8);

        //常规循环循环,删除会导致序号移位
//        for(int i=0; i < mylist.size();i++){
//            if(mylist.get(i) == 4){
//                mylist.remove(i--);
//            }
//            else{System.out.print(mylist.get(i)+" ");}
//        }

        //加强for循环:删除元素会引起并行修改错误
//        for(int i:mylist){
//        }

        //迭代器，内部类，只能用一次next（）
        Iterator<Integer> iter = mylist.iterator();
        while (iter.hasNext()) {
            Integer a = iter.next();
            if(a==4){
                iter.remove();
            }
            else{System.out.print(a+" ");}
        }
        System.out.println(a);
    }
}
