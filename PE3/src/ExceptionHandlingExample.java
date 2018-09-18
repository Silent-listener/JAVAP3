public class ExceptionHandlingExample {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6};
        try {
            int[] negative = new int[-1];
        }
        catch(NegativeArraySizeException e) {
            System.out.println(e);
        }
        try{
            System.out.println(array[10]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);S
        }
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
