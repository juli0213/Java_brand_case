import java.io.File;
public class file_fileLength {
    public static long getFileSize(String filename){
        File file = new File(filename);
        if(!file.exists() || !file.isFile()){
            System.out.println("No exists");
            return -1;
        }
        return file.length();
    }

    public static void main(String [] args){
        long size = getFileSize("runoob.txt");
        System.out.println("the size of file is "+size);
    }
}
