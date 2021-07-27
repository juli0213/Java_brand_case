import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class collection_compare {
    public static void main(String[] agrs){
//        HashMap<>[] arr = new HashMap[];
        String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set = new TreeSet<String>();
        for(int i = 0; i < coins.length;i++){
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        for(int i = 0;i<=10;i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}
