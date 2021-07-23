import java.io.*;
public class file_write {
    public static void main(String[] args){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("Done！");
        }catch (IOException e){

        }
    }
}
