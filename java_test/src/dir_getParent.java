import java.io.File;
public class dir_getParent {
    public static void main(String []args){
        File file = new File("./myfile");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上机目录为：" + strParentDirectory);
    }
}
