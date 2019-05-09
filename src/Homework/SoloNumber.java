import java.util.Scanner;

public class SoloNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            long s = scanner.nextLong();
            int a = 0;  //应该放哪里？
            for (int i = 2; i < s/2 +1; i++) {
                if (s % i == 0) {
                    a +=1;
                }
            }
            if (a == 0){
                System.out.println(s + "是质数");
            }
            else{
                System.out.println(s + "不是质数" + a + "个因数");
            }
        }
    }
}
