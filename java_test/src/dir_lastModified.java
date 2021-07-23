import java.io.File;
import java.util.Date;
public class dir_lastModified {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
    }
}
