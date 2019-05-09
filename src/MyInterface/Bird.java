package MyInterface;

/**
 * @author:Administrator
 * @date: 2019/5/8
 * @description:
 */
public class Bird implements fly{
    @Override
    public void myfly() {
        System.out.println("bird fly");

    }

    @Override
    //a表示飞行距离，返回消耗
    public int comsumer(int a) {
        return a*100;
    }


}
