import java.io.File;
import java.util.Date;

public class file_lastModified {
    public static void main(String[] args){
        File file = new File("filename");
        Long lastModifiedTime = file.lastModified();
        Date date = new Date(lastModifiedTime);
        System.out.println(lastModifiedTime);
        System.out.println(date);
    }

}
