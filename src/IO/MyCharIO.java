package IO;

import java.io.*;

/**
 * @author:Administrator
 * @date: 2019/6/2
 * @description: char数组=String 读,可以直接输出
 */
public class MyCharIO {
    public static void main(String[] args) {
        try {
            FileReader myFileInput = new FileReader("resource/myinput.txt");
            char [] buffer = new char[1024];
            while (myFileInput.read(buffer) >0 ){
                System.out.println(buffer);
            }
            myFileInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
