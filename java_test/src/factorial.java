public class factorial {
    public static void main(String args[]){
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("%d != %d\n", counter, factotal_f(counter));
        }
    }

    public static long factotal_f(long number){
        if (number <= 1){
            return 1;
        }
        else{
            return number * factotal_f(number - 1);
        }
    }
}
