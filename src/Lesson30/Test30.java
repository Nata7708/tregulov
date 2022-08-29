package Lesson30;
import java.util.ArrayList;
public class Test30 {

    }

class Student{
    String name;
    char sex;
    int age;
    int course;
    double advGrade;
    Student(String name, char sex, int age, int course, double advGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.advGrade = advGrade;

    }
}

class StudentInfo{
    void printStudent (Student st){
        System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", gradle: " + st.advGrade);
    }
    void printStudentOverGradle(ArrayList<Student> aL, double advGradle){
        for (Student s: aL){
            if (s.advGrade > advGradle){
                printStudent(s);
            }
        }
    }
    void printStudentUnderGradle(ArrayList<Student> aL, double advGradle){
        for (Student s: aL){
            if (s.advGrade < advGradle){
                printStudent(s);
            }
        }
    }
    void printStudentOverAge(ArrayList<Student> aL, int age){
        for (Student s: aL){
            if (s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentUnderAge(ArrayList<Student> aL, int age){
        for (Student s: aL){
            if (s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentBySex(ArrayList<Student> aL, char sex){
        for (Student s: aL){
            if (s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentMixConditions(ArrayList<Student> aL, double advGradle, int age, char sex){
        for (Student s: aL){
            if (s.advGrade > advGradle && s.age < age && s.sex == sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sergey", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 20, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        si.printStudentOverGradle(list, 8.5);
        System.out.println("-------------------------------------------");
        si.printStudentUnderGradle(list, 9);
        System.out.println("-------------------------------------------");
        si.printStudentOverAge(list, 25);
        System.out.println("-------------------------------------------");
        si.printStudentUnderAge(list, 29);
        System.out.println("-------------------------------------------");
        si.printStudentBySex(list, 'm');
        System.out.println("-------------------------------------------");
        si.printStudentMixConditions(list, 7.2, 23, 'n');
    }

}