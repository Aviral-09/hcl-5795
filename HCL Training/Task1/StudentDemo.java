package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int rollNo;
    int age;
    double marks;

    public Student(String name, int rollNo, int age, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", RollNo=" + rollNo + ", Age=" + age + ", Marks=" + marks + "]";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 101, 21, 85.5));
        students.add(new Student("Priya", 102, 20, 92.0));
        students.add(new Student("Amit", 103, 22, 78.5));
        students.add(new Student("Sneha", 104, 20, 88.0));
        students.add(new Student("Karan", 105, 23, 95.5));
        students.add(new Student("Neha", 106, 21, 90.0));
        students.add(new Student("Vikas", 107, 22, 82.0));
        students.add(new Student("Pooja", 108, 19, 88.5));
        students.add(new Student("Rohit", 109, 21, 76.0));
        students.add(new Student("Anjali", 110, 20, 94.5));


        List<Student> sortedByAge = new ArrayList<>(students);
        List<Student> sortedByMarks = new ArrayList<>(students);

        sortedByAge.sort(Comparator.comparingInt(s -> s.age));

        System.out.println("Sorted By Age");
        for (Student s : sortedByAge) {
            System.out.println(s);
        }

        sortedByMarks.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));

        System.out.println("\nSorted By Marks");
        for (Student s : sortedByMarks) {
            System.out.println(s);
        }

    }
}