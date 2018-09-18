import java.text.SimpleDateFormat;
import java.util.*;

public class WeekDates {
    public static void main(String args[]) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE dd/mm/yyyy");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("First date of week: "+dateFormat.format(c.getTime()));
        for(int i=0; i<6; i++)
        {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("Last date of week: "+dateFormat.format(c.getTime()));
    }
}
