import java.util.Arrays;
import java.util.Collections;
//Collections 类里面有好多的方法能用，比如reverse
public class arr_max_min {
    public static void main(String []args){
//      Integer类里面抱恨了int的值，还有一些方法
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
//      Arrays.asList(numbers)将数组转为列表
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
    }
}
