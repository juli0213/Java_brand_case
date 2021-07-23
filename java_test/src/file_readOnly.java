import java.io.File;
public class file_readOnly {
    public static void main(String [] args){
        File file = new File("filename");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
