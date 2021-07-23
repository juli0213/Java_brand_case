import java.io.*;
public class file_copy {
    public static void main(String[] args) throws Exception{
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("String to be copyed");
        out1.close();
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream(new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0){
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
//        读取复杂的文件
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;
        while ((str = in1.readLine())!=null){
            System.out.println(str);
        }
        in1.close();

    }
}
