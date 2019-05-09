public class Student {
    public static String classNumber;
    public int age;
    protected int score;
   protected long telPhone;
   private static String school="第一中学";

   // 对private变量设置修改和访问方法，修改后，父类会改变吗
    public static String getSchool() {
        return school;
    }
    public static void setSchool(String mone) {
        school = mone;
    }

    //构造方法,定义实例
    public Student(int age, int score, long telPhone){
        //变量名一样才需要前缀this吗？
        this.age = age;
        this.score = score;
        this.telPhone = telPhone;
    }
    public Student(){}  //无参构造

    public void surfInternet(){         //和成员变量命名一致有什么影响？
        if (age >18 && score >60){
            System.out.println("you can surf the internet ");
        }
        else{ System.out.println("you can't surf the internet");
        }
    }
    public static String printClassNumber(){
        return classNumber;     //当方法输入变量和之前定义变量一致时，怎么区分？ 实例名怎么引用
    }

    protected  void connectParent(){
        if (score <60){
            System.out.println("please connect the parents," + telPhone);
        }
    }

    public static void main(String[] args) {   //需要吗？执行的起点，只能引用静态方法和变量
        Student joke =new Student(19, 50, 83811041);
        System.out.println("joke");
        // 过程，没有返回值
        joke.connectParent();
        joke.surfInternet();
        System.out.println(school);

    }



}
