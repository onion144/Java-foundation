
public class LookFlower {
    public static void main(String[] args) {
        int a,b,c;
        for (int i = 100; i < 1000; i++){
            a = i % 10;   //个位数
            b = (i / 10) % 10;  //十位数
            c = (i / 100) % 10;  //十位数
       if (i == (int)(Math.pow(a,3) + Math.pow(b, 3) + Math.pow(c, 3))){
            System.out.println(i);}
        }
    }
}
