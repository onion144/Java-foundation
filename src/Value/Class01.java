public class Class01 extends Student{
   public Class01(int age, int score, long telPhone){
       super(age, score, telPhone);
   }

    public static void main(String[] args) {
        Class01.setSchool("四十中学");     //类名调用静态方法（类方法）
        System.out.println(Class01.getSchool());
        System.out.println(Student.getSchool());  //子类对类变量改动会影响父类
        Class01 mary =new Class01(20,56,11203);
        mary.connectParent();
        mary.surfInternet();
        mary.sleep();
    }
    //新加方法
    public void sleep(){
       System.out.println("youshold sleep at least 8h");
    }

    @Override
    public void surfInternet(){
        if (age >18 && score >50){
            System.out.println("you can surf the internet ");
        }
        else{ System.out.println("you can't surf the internet");
        }
    }
}
