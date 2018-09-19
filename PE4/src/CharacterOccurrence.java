import java.util.*;

public class CharacterOccurrence {
    public int countChar(char ch, String input){
        int initialLength = input.length();
        String string1 = Character.toString(ch);
        String replaced = input.replaceAll(string1,"");
        int finalLength = replaced.length();
        int answer = initialLength -finalLength;
        return answer;
    }
}