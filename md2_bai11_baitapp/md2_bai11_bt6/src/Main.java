import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String str = "26/02/1999";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf.parse(str);
        System.out.println(birthDate);
    }
}
