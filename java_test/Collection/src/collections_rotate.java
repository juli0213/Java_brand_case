import java.util.*;
public class collections_rotate {
    public static void main(String[] args){
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List:"+ list);
//        方法第二个参数指定了移动的起始位置
        Collections.rotate(list, 3);
        System.out.println("rotate: "+list);
    }
}
