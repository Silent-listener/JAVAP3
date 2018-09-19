import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {
    public List<String> checkMultipleOccurrence (String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> occurrenceList = new ArrayList<String>();
        String s1 = "";
        while(matcher.find()){
            s1 = "Found at: " + matcher.start() + "-" + matcher.end();
            occurrenceList.add(s1);
        }
        return occurrenceList;

    }
}
