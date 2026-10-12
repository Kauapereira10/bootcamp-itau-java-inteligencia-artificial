import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClasseCalendar {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        var stringDate = format.format(calendar.getTime());
        stringDate = stringDate.replace("19:", "21:");
        var newDate = format.parse(stringDate);
        var newCallendar = Calendar.getInstance();
        newCallendar.setTime(newDate);

        System.out.println(format.format(newCallendar.getTime()));
    }
}
