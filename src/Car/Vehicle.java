package Car;

/**
 * @author:Administrator
 * @date: 2019/4/28
 * @description:
 */
public class Vehicle extends MyCar {
   public int goodlaod;
   public static int number;
   public String name ="VV";
    //父类可以没有无参构造，只需要重载super方法
    public Vehicle(String name, int ps,int goodlaod){
        super(name,ps);
        this.goodlaod=goodlaod;
    }
    public Vehicle(String name,int ps){
        super(name,ps);
    }


    @Override
    public void fly(){
        drive();
        System.out.println(" vvv fly");
    }


    public void load(){
        System.out.println("载"+goodlaod+"t货");
    }

    private void drive() {
        System.out.println(getName() + "  VV开动");
    }

    public static void sum(){
        System.out.println("Vee");
        System.out.println(number);
    }
}

