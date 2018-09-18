import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelRemoval {
    public static String[] removeVowels(String[] places) {
        List<String> StringsWithoutVowels = new ArrayList<>();
        for( int i = 0; i < places.length; i++){
           String removevowels = remVowel(places[i]);
           StringsWithoutVowels.add(removevowels);
        }
        String[] answer = StringsWithoutVowels.toArray(new String[StringsWithoutVowels.size()]);
        return answer;
    }

    public static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u'};
        List<Character> al = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }
        return sb.toString();
    }

}
