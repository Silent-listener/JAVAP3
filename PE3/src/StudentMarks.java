class GradesOutOfRange extends Exception{
    public GradesOutOfRange(String error){
        super(error);
    }
    public String toString(){
        return "error";
    }

}
public class StudentMarks {
    public static String input(int numOfStudents, int[] stuGrades) {
        for (int i = 0; i<numOfStudents; i++){
            try {
                if(stuGrades[i] < 0 || stuGrades[i] >100) {
                    throw new GradesOutOfRange(stuGrades[i] + "Invalid Grades");
                }
            }
            catch (GradesOutOfRange e) {
                System.out.println(e);
                String ans = e.toString();
                return ans;
            }
        }
        return "Valid Grades";
    }
}
