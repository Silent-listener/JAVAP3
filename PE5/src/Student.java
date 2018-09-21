public class Student {
    private String id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
