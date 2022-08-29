package Lesson30;

import java.util.ArrayList;

public class Test301 {
}

class Students{
    String name;
    char sex;
    int age;
    int course;
    double advGrade;
    Students(String name, char sex, int age, int course, double advGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.advGrade = advGrade;

    }
}

class StudentsInfo{
    void printStudent (Students st){
        System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", gradle: " + st.advGrade);
        }

    void testStudents(ArrayList <Students> aL, StudentChecks sc){
        for (Students s: aL){
            if (sc.testStudents(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Students> list = new ArrayList<>();
        Students st1 = new Students("Ivan", 'm', 22, 3, 8.3);
        Students st2 = new Students("Sergey", 'm', 28, 2, 6.4);
        Students st3 = new Students("Elena", 'f', 20, 1, 8.9);
        Students st4 = new Students("Petr", 'm', 35, 4, 7);
        Students st5 = new Students("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentsInfo si = new StudentsInfo();
        FindStudentsOverGradle fsog = new FindStudentsOverGradle();
        FindStudentsUnderGradle fsug = new FindStudentsUnderGradle();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixConditions fsmc = new FindStudentsMixConditions();

        si.testStudents (list, fsog);
        System.out.println("-------------------------------------------------");
        si.testStudents (list, fsug);
        System.out.println("-------------------------------------------------");
        si.testStudents (list, fsoa);
        System.out.println("-------------------------------------------------");
        si.testStudents (list, fsua);
        System.out.println("-------------------------------------------------");
        si.testStudents (list, fsbs);
        System.out.println("-------------------------------------------------");
        si.testStudents (list, fsmc);
        System.out.println("-------------------------------------------------");


    }

}
interface StudentChecks{
    boolean testStudents (Students s);
}
class FindStudentsOverGradle implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return s.advGrade > 8.5;
    }
}
class FindStudentsUnderGradle implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return s.advGrade < 9;
    }
}
class FindStudentsOverAge implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return s.age > 25;
    }
}
class FindStudentsUnderAge implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return s.age > 27;
    }
}
class FindStudentsBySex implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return s.sex == 'm';
    }
}
class FindStudentsMixConditions implements StudentChecks{
    @Override
    public boolean testStudents(Students s) {
        return (s.advGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}