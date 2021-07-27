import java.util.Enumeration;
import java.util.Hashtable;
public class HashTable_keys {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
//        获取的只是键值
        Enumeration e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
