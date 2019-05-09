package Value;

/**
 * @author:Administrator
 * @date: 2019/4/20
 * @description:
 */
public class Animal {
    String name;
    int age;
    public void eat(){
        System.out.println(name + "动物能吃");
    }
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
}
