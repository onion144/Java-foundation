import java.util.Arrays;

public class InPut{
    public static void main(String[] args) {
        int a = 0;
        int[] arr1 = new int[10];
        double b = 5.12;
        int c = (int)b;

        byte n =2;
//        n = n+2;    //报错
        n = (byte)(n+2);
        n+=1;
        n++;
        System.out.println(b);
    }
}
