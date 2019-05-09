package Car;

import java.util.Objects;

/**
 * @author:Administrator
 * @date: 2019/4/27
 * @description:
 */
public class MyCar {
    public String name;
    public int ps;
    private int id;
    public static int number;


    public MyCar(String name, int ps){
        this.name = name;
        this.ps = ps;
        number++;
        id =number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void drive(){
        System.out.println(name+"  car开动");
    }

    public void fly(){
        drive();
        System.out.println("carfly");
    }    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", ps=" + ps +
                ", id=" + id +
                '}';
    }
    //定义中静态方法只能调用静态
    public static void sum(){
        System.out.println("car");
        System.out.println(number);
    }


//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MyCar)) return false;
//
//        MyCar myCar = (MyCar) o;
//
//        if (ps != myCar.ps) return false;
//        return name.equals(myCar.name);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        result = 31 * result + ps;
//        return result;
//    }


//实现Compare接口，重写compareTo，0代表重复，不添加
//    @Override
//    public int compareTo(Object o) {
//        if (o == null) {
//            return 0;
//        }
//        if (!(o instanceof MyCar)) {
//            return 0;
//        }
//        MyCar myCar = (MyCar) o;
//        int i = name.compareTo(myCar.name);
//        if (i==0) {
//            return (ps - myCar.ps);
//        }
//        return i;
//    }
}
