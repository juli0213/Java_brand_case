//使用Socket连接到指定的主机
import java.net.InetAddress;
import java.net.Socket;
public class socket_getaddress {
    public static void main(String[] args) {
        try{
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println("connect in " + addr);
            sock.close();
        }catch (java.io.IOException e){
            System.out.println("Denied" +args[0]);
            System.out.println(e);
        }
    }
}
