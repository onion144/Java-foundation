import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,8,66,4,58,2,4,0,55,28,71,19};
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if (arr[i] > arr[j]) {           //不要引入新变量
                    // 两元素交换:一个数与其他数异或两次等于本身； 0异或任何数 等于他本身
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[j]^arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));   //引用对象的值,需要调用函数
    }

}
