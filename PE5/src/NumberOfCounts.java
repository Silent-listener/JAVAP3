import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    public static Map<String,Integer> countingWords(String input){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher m1 = pattern.matcher(input);
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        while(m1.find()){
            if (wordCount.containsKey(m1.group())) {
                wordCount.put(m1.group(), wordCount.get(m1.group()) + 1);
            }else {
                wordCount.put(m1.group(), 1);
            }
        }
        return wordCount;
    }
    public static void main(String args[]){
        String input = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> ans=new LinkedHashMap<>(countingWords(input));
        System.out.println(ans);
    }
}
