public class removeChar {
    public static void main(String args[]){
        String str = "this is Java";
        System.out.println(removeCharAT(str, 3));
    }

    //删除一个字符 = 0:pos + pos:-1
    public static String removeCharAT(String s, int pos){
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
