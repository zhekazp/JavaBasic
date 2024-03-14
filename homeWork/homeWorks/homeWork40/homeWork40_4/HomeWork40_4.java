package homeWorks.homeWork40.homeWork40_4;

import homeWorks.homeWork40.homeWork40_1.HomeWork40_1;

import java.util.ArrayList;
import java.util.List;

public class HomeWork40_4 {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Student1",2020,4.5));
        students.add(new Student("Student2",2021,4.6));
        students.add(new Student("Student3",2020,4.8));
        students.add(new Student("Student4",2020,4.9));
        students.add(new Student("Student4",2022,4.7));
        students.add(new Student("Student4",2021,4.8));

        List<Student> students2=students.stream().sorted((student1,student2)->
                {
                    int result=0;
                    if(student2.getAvgGrade()-student1.getAvgGrade()<0){
                        result=-1;
                    } else if (student2.getAvgGrade()-student1.getAvgGrade()>0) {
                        result=1;
                    }
                    if(result==0){
                        result=student1.getJear()-student2.getJear();
                    }

                    return result;
                }                                         )
                .limit(3).toList();
        System.out.println(students2);

    }

    static class  Student {
        String name;
        int jear;
        double avgGrade;

        public Student(String name, int jear, double avgGrade) {
            this.name = name;
            this.jear = jear;
            this.avgGrade = avgGrade;
        }

        public String getName() {
            return name;
        }

        public int getJear() {
            return jear;
        }

        public double getAvgGrade() {
            return avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + jear +
                    ", avgGrade=" + avgGrade +
                    '}';
        }
    }
}
