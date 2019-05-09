package SystemClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:Administrator
 * @date: 2019/4/22
 * @description: 如何进行有关时间操作  UNIX时间：1970-01-01 00：00 获取时间（date类） 简化时间（SimpleDateFormat）
 *               类名如果和自用类名一致会无法导入,string 类被覆盖会导致无法运行
 */
public class DemoDate {
    public static void main(String[] args) {
        Date da = new Date();
        long c = da.getTime();
        System.out.println(da);       //Tue Apr 23 16:44:48 CST 2019
        System.out.println(c);         //1556009931026
        //默认构造，19-4-23 下午5:10
        SimpleDateFormat simpletime = new SimpleDateFormat();
        //"yyyy-MM-dd HH:mm:ss"构造，2019-04-23 17:11:57
        SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //HH 24小时制
        String def = simpletime.format(c);
        String own = simpledate.format(c);
        System.out.println(def);
        System.out.println(own);

       try{
           Date dee = simpledate.parse("dafffff");         //"yyyy-MM-dd HH:mm:ss" 这个形式才可以转化
           System.out.println(dee);
       }
       catch (ParseException a){
           a.printStackTrace();                                    //打印异常
           System.out.println("出现异常");
       }
    }
}
