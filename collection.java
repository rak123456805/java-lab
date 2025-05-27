import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "{ Name = " + name + ", Age = " + age + " }";
    }
}

public class collection {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
