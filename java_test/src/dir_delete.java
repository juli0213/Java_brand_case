import java.io.File;
public class dir_delete {
    public static void main(String[] argv) throws Exception {
        deleteDir(new File("./a"));

    }

    public static boolean deleteDir(File dir){
        if(dir.isDirectory()){
            String[] children = dir.list();
            for(int i = 0;i<children.length;i++){
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success){
                    return false;
                }
            }
        }
        if(dir.delete()){
            System.out.println("Done");
            return true;
        }
        else{
            System.out.println("Fail");
            return false;
        }
    }
}
