import java.io.File;
import java.util.Date;
public class file_changeLastModified {
    public static void main(String [] args)throws Exception{
        File fileToChange = new File("runoob.txt");
        fileToChange.createNewFile();
        //获取文件最后修改时间并输出
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        //修改文件最后修改时间为当下时间并输出
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
