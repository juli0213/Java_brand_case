import java.io.*;
public class dir_findFileWithName {
    public static void main(String []args){
        File dir = new File("C:");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("b");
            }
        };
        String[] children = dir.list(filter);
        if(children == null){
            System.out.println("error");
        }
        else{
            for (int i = 0;i < children.length;i++){
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
