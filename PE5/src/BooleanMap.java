import java.util.LinkedHashMap;
import java.util.Map;


public class BooleanMap {
    public static Map<String, Boolean> counterToBool (String[] input){
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word: input) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {

                wordCount.put(word, 1);
            }
        }
        Map<String, Boolean> isboolean = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue() >= 2){
                isboolean.put(entry.getKey(),true);
            }
            else {
                isboolean.put(entry.getKey(),false);
            }
        }
        return isboolean;
    }
//    public static void main(String args[]){
//        String[] input = {"a","b","c","d","a","c","c"};
//        Map<String, Boolean> ans=new LinkedHashMap<>(counterToBool(input));
//        System.out.println(ans);
//    }
}
