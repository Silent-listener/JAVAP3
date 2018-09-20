import java.lang.reflect.Array;
import java.util.List;

public class ArrayUpdations {
    public List<String> updatingIndex(List<String> input, int index, String replace){
//        if(index < 0 || index > (input.size()-1)){
//
//
//        } else {
            input.set(index, replace);
            System.out.println(input);

            return input;
        }
//    }

    public int emptyList(List<String> input){
        input.clear();
        int size = input.size();
        return size;
    }
}
