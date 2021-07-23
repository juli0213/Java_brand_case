import java.io.File;
public class file_comparePath {
    public static void main(String [] args){
        File file1 = new File("filename");
        File file2 = new File("myfile.txt");
        if(file1.compareTo(file2) == 0){
            System.out.println("路径一致");
        }
        else{
            System.out.println("路径不一致");
        }
    }
}
