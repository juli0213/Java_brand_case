//获取本机IP地址及主机名
import java.net.InetAddress;
public class net_ip {
    public static void main(String[] args) throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: " + addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: "+hostname);
    }
}
