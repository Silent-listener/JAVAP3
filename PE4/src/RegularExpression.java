import java.util.regex.Pattern;

public class RegularExpression {
    public boolean findString (String inp){
        boolean flag = inp.matches("(?s).*\\bHarry\\b.*");
        return flag;
    }
}
