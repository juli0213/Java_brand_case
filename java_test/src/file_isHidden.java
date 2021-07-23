import java.io.File;
public class file_isHidden {
    public static void main(String[] args){
        File file = new File("myfile");
        System.out.println(file.isHidden());
    }
}
