import java.io.File;
import java.io.IOException;
public class dir_mkdirs {
    public static void main(String[] args){
        String directories = "D:\\my_code\\java_test\\a";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
