import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortedWordsFromPara {
    public static void sortWords(String input){
        Pattern p = Pattern.compile("[a-zA-Z0-9-]+");
        Matcher m1 = p.matcher(input);
        String s1 = "";
        List<String> listOfwords = new ArrayList<String>();
        while(m1.find()){
            s1 = m1.group();
            listOfwords.add(s1);
        }
        Collections.sort(listOfwords);

        System.out.println(listOfwords);
    }
    public static void main(String[] args){
        String inp = "my very 16 djdopdcjf. just, do, collect-it";
        sortWords(inp);
    }
}

