import java.io.File;
import java.io.IOException;
public class file_createNewFile {
    public static void main(String[] args){
        try {
            File file = new File("myfile.txt");
            if(file.createNewFile()){
                System.out.println("Done!");
            }
            else{
                System.out.println("Error");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
