import java.io.*;
public class file_delete {
    public static void main(String[] args){
        try {
            File file = new File("filename");
            if (file.delete()){
                System.out.println("Done!");
            }
            else{
                System.out.println("Fail!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
