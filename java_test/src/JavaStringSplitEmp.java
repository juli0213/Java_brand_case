public class JavaStringSplitEmp {
//    以下实例使用了 split(string) 方法通过指定分隔符将字符串分割为数组：
    public static void main(String args[]){
        String str = "www-runoob-com";
        String[] temp; //元素是string 类型的数组
        String delimeter = "-"; //指定分割字符
        temp = str.split(delimeter);
        for (int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
            System.out.println("");
        }

        System.out.println("------java for each循环输出的方法-----");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\."; //转义符
        temp1 = str1.split(delimeter1);
        for (String x : temp1){
            System.out.println(x);
            System.out.println("");
        }
    }
}
