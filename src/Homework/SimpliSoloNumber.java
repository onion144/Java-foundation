import java.util.Scanner;

public class SimpliSoloNumber {
        public static void main(String[] args) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                long s = scanner.nextLong();
                for (int i = 2; i*i < s; i++) {
                    if (s % i == 0) {
                        System.out.println(s + "不是质数");
                    }
                }
        }
    }
}
