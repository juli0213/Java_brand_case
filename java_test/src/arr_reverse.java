
public class arr_reverse {
    public static void main(String []args){
//        java数组自身没有reverse函数
        int []a = {1,2,3,4,5,6};
        reverse(a, a.length);
    }
    static void reverse(int []a, int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0;i<n;i++){
            b[j-1] = a[i];
            j = j-1;
        }
        System.out.println("The reversed array is :");
        for (int k=0;k<n;k++){
            System.out.print(b[k] + " ");
        }
    }
}
