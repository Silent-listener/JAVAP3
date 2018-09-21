import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest {
    public static void main(String args[]) {
        Student s1 = new Student("23323", "Zoro", 22);
        Student s2 = new Student("45612", "Zoro", 19);
        Student s3 = new Student("23435", "Freddy", 36);
        Student s4 = new Student("45612", "Freddy", 36);
        Student s5 = new Student("23767", "Novak", 31);

        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students, new StudentSorter());
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + " " + students.get(i).getName() + " " + students.get(i).getAge());
        }
    }
}
