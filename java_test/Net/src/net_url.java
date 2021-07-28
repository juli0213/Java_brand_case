//获取远程文件大小
import java.net.URL;
import java.net.URLConnection;
public class net_url {
    public static void main(String[] args) throws Exception{
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if(size < 0){
            System.out.println("cant do");
        }
        else{
            System.out.println("size is " + size +"bytes");
        }
        conn.getInputStream().close();

    }
}
