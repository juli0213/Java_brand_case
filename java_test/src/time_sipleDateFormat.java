import java.text.SimpleDateFormat;
import java.util.Date;
public class time_sipleDateFormat {
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-DD HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
