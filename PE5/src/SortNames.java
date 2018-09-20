import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortNames {
    public static List<String> sortingNames(String[] input){
        SortedSet<String> names = new TreeSet<>();

        for (int i = 0; i<input.length; i++) {
            names.add(input[i]);
        }
        List<String> answer = new ArrayList<>(names);
        return answer;
    }

//        public static void main(String args[]){
//        String[] input = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
//        List<String> answer = sortingNames(input);
//        System.out.println(answer);
//    }
}
