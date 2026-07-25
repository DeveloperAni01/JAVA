
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age < that.age) {
            return 1;
        } else {
            return -1;
        }
    }

    
}




public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ani", 23));
        students.add(new Student("Amit", 20));
        students.add(new Student("Adi", 25));
        students.add(new Student("Aritra", 30));
        students.add(new Student("Deba", 18));

        Collections.sort(students);

        for (Student stu : students) {
            System.out.println(stu.getName() + " -> " + stu.getAge());
        }
    }
}
