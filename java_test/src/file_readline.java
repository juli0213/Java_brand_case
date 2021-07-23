import java.io.*;
public class file_readline {
    public static void main(String[] args){
        try{
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while((str = in.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (IOException e){
        }
    }
}
