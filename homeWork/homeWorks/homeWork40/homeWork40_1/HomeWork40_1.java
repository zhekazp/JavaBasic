package homeWorks.homeWork40.homeWork40_1;

import java.util.ArrayList;
import java.util.List;

public class HomeWork40_1 {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Student1",20,4.5));
        students.add(new Student("Student2",22,4.6));
        students.add(new Student("Student3",23,4.3));
        students.add(new Student("Student4",21,4.7));
        List<Student> students2=students.stream()
                .filter(student->student.getAge()>20 && student.getAvgGrade()>4.5).toList();
        System.out.println(students2);

    }

static class  Student {
        String name;
        int age;
        double avgGrade;

    public Student(String name, int age, double avgGrade) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
}

