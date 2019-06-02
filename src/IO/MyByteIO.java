package IO;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @author:Administrator
 * @date: 2019/5/30
 * @description: byte数组读写，转为String打印
 */
public class MyByteIO {
    public static void main(String[] args) {

        InputStream myFileInput = null;
        OutputStream myFileOutput = null;
        //缓冲区 一次读取1024字节
        byte [] buffer = new byte[1024];
        try {
            myFileInput = new FileInputStream("resource/myinput.txt");
            myFileOutput = new FileOutputStream("resource/myoutput.txt");
            int k;
            while ((k = myFileInput.read(buffer)) > 0){
                //改为String输出
                System.out.println(new String(buffer));
                myFileOutput.write(buffer);
            }
            myFileInput.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
