import java.io.*;
public class file_createTempFIle {
    public static void main(String [] args) throws Exception{
        // 创建临时文件
        File temp = File.createTempFile("rtestrunoobtemp", ".txt");
        // 输出绝对路径
        System.out.println("wenjianlujing "+ temp.getAbsolutePath());
        // 终止后删除临时文件
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("astring");
        System.out.println("Done");
        out.close();
    }
}
