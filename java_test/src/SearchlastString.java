public class SearchlastString {
//    以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
    public static void main(String args[]){
        String strOrig = "Hello world ,Hello Runboo";
        int lastIndex = strOrig.lastIndexOf("Runboo");
        if (lastIndex == -1){
            System.out.println("no same string");
        }
        else{
            System.out.println("The location of Runboo is " + lastIndex);
        }

    }
}
