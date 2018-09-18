public class ExceptionHandlingBasic {
    public static void main(String[] args){
        try{
            throw new Exception("Exception Thrown");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally executed");
        }
    }
}