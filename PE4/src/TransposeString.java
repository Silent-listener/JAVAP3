public class TransposeString {
    public String findTranspose(String inp){
        if(inp == ""){
            return null;
        } else {
            String[] words = inp.split(" ");
            String reversedString = "";
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
            String ans = reversedString.trim();
            return ans;
        }
    }
}
