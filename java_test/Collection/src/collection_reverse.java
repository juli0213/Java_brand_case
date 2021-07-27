import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class collection_reverse {
    public static void main(String[] args){
        String[] coins = { "A", "B", "C", "D", "E" };
        List l = new ArrayList();
        for (int i = 0; i < coins.length; i++){
            l.add(coins[i]);
        }
        ListIterator liter = l.listIterator();
        System.out.println("Before");
        while(liter.hasNext()){
            System.out.println(liter.next());
        }
        Collections.reverse(l);
        //这里很重要，要再来一个新的listIterator，之前的那个已经空了
        liter = l.listIterator();
        System.out.println("After");
        while(liter.hasNext()){
            System.out.println(liter.next());
        }
    }
}
