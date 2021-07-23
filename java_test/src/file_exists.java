import java.io.File;
public class file_exists {
    public static void main(String[] args){
        File file = new File("filename");
        System.out.println(file.exists());
    }
}
