//import java.util.*;
//public class collection_remove {
//    public static void main(String[] args){
//        System.out.println("集合实例！\n");
//        int size;
//        HashSet collection = new HashSet();
//        String str1 = "Yellow", str2 = "White", str3 =
//                "Green", str4 = "Blue";
//        Iterator iterator;
//        collection.add(str1);
//        collection.add(str2);
//        collection.add(str3);
//        collection.add(str4);
//        System.out.print("集合数据: ");
//        iterator = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
//        collection.remove(str2);
//        System.out.println("删除之后 [" + str2 + "]\n");
//        System.out.print("现在集合的数据是: ");
//        iterator = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
//        size = collection.size();
//        System.out.println("集合大小: " + size + "\n");
//    }
//}
public class collection_remove
{
    public static void main(String[] args) {
        Person p = new Person();
        double pow = Math.pow(2, 3);
        String[] fullname = new String[]
                {"Roger", "Federer"
                };
        p.setName(fullname);
        System.out.println(Math.pow(2, 3));
        fullname[0] = "Tony";
//        System.out.println(p.f());
    }
}
class Person
{
    private String[] name;
    public int f(int x){
        return ((x>0)?x*f(x-1):2);
    }
    public void setName(String[] name) {
        this.name = name;
    }
}

