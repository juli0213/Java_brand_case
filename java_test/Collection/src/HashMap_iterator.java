import java.util.*;
public class HashMap_iterator {
    public static void main(String[] args){
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection c1 = hMap.values();
        Iterator it = c1.iterator();
        while(it.hasNext()){
//            方法 next 的作用是返回迭代器指向的元素，并且更新迭代器的状态，将迭代器指向的元素后移一位。
            System.out.println(it.next());
        }
    }
}
