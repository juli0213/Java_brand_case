import java.io.File;
import java.io.IOException;
public class file_rename {
    public static void main(String [] args) throws Exception{
        File oldName = new File("runoob.txt");
        File newName = new File("runoob_new.txt");
        if (newName.exists()){
            //确保新文件不存在
            throw new java.io.IOException("file exists");
        }
        if (oldName.renameTo(newName)){
            System.out.println("Done!");
        }
        else{
            System.out.println("Error!");
        }
    }
}
