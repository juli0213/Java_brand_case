import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class collection_element {
    public static void main(String [] args){
        listTest();
        setTest();
    }

    public static void setTest(){
        Set<String > set = new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }
    }

    public static void listTest(){
        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
