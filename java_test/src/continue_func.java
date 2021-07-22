public class continue_func {
    public static void main(String[] args){
        StringBuffer searchstr = new StringBuffer("hello how are u.");
        int length = searchstr.length();
        int count = 0;
        for(int i = 0; i < length; i++){
//            charAt()方法返回字符串指定位置的字符
            if(searchstr.charAt(i) != 'h'){
                continue;}
            count++;
//            setcharAt将字符串第i个位置改为h
            searchstr.setCharAt(i, 'h');
        }
        System.out.println("发现" + count + "个h字符");
        System.out.println(searchstr);
    }
}
