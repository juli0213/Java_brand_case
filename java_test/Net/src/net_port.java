//查看端口是否已使用
import java.net.*;
import java.io.*;
public class net_port {
    public static void main(String[] args) {
        Socket Skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("chankan" + i);
                Skt = new Socket(host, i);
                System.out.println("port " + i + " used");
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {
            }
        }
    }
}
