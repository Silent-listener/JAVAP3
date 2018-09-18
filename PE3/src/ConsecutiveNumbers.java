import java.util.Arrays;

public class ConsecutiveNumbers {
    public static String checkConsecutive(String inp){
        String[] numbers = inp.split(",");
        int[] numArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArray[i]=Integer.parseInt(numbers[i]);
        }
        Boolean value = true;
        Arrays.sort(numArray);
        for (int i = 0; i < (numArray.length)-1; i++){
            if((numArray[i]+1) != numArray[i+1]){
                value = false;
                break;
            }
        }
        if (value == true) {
            return inp+ " are consecutive numbers";
        } else {
            return inp+ " non consecutive numbers";
        }

    }
}
