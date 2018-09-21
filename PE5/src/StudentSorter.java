public class StudentSorter implements Comparator {
    public int compare (Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.getAge() == s2.getAge()){
            int answer = s1.getName().compareTo(s2.getName());
            if(answer == 0){
                return (s1.getId().compareTo(s2.getId()));
            }
            return answer;
        }
        else if(s1.getAge() > s2.getAge())
            return 1;
        else
            return -1;
    }

}
