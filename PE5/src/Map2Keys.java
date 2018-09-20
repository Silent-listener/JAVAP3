import java.util.*;

public class Map2Keys {
    public Map<String, String> modifyKeysOfMap(Map<String, String> input) {
        if(input.get("val1")!= null){
            input.put("val2",input.get("val1"));
            input.put("val1"," ");
            return input;
        }
        else {
            System.out.println("Value not found for given key");
            return null;
        }
    }
}
