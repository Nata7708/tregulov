package Lesson30;

import java.util.ArrayList;

public class Test302 {
}
class Studenty{
    String name;
    char sex;
    int age;
    int course;
    double advGrade;
    Studenty(String name, char sex, int age, int course, double advGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.advGrade = advGrade;

    }
}

class StudentyInfo{
    void printStudenty (Studenty st){
        System.out.println("Student's name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", gradle: " + st.advGrade);
    }

    void testStudenty (ArrayList <Studenty> aL, StudentyChecks sc){
        for (Studenty s: aL){
            if (sc.test(s)){
                printStudenty(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Studenty> list = new ArrayList<>();
        Studenty st1 = new Studenty("Ivan", 'm', 22, 3, 8.3);
        Studenty st2 = new Studenty("Sergey", 'm', 28, 2, 6.4);
        Studenty st3 = new Studenty("Elena", 'f', 20, 1, 8.9);
        Studenty st4 = new Studenty("Petr", 'm', 35, 4, 7);
        Studenty st5 = new Studenty("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentyInfo si = new StudentyInfo();

// лямбда выражения
        si.testStudenty (list, (Studenty st) -> {return st.advGrade > 8.5;});
        System.out.println("-------------------------------------------------");
        si.testStudenty (list, st -> st.advGrade < 9); //короткая запись
        System.out.println("-------------------------------------------------");
        si.testStudenty (list, (Studenty st) -> {return st.age > 25;});
        System.out.println("-------------------------------------------------");
        si.testStudenty (list, (Studenty st) -> {return st.age > 29;});
        System.out.println("-------------------------------------------------");
        si.testStudenty (list, (Studenty st) -> {return st.sex == 'm';});
        System.out.println("-------------------------------------------------");
        si.testStudenty (list, (Studenty st) -> {return st.advGrade > 7.2 && st.age < 23 && st.sex == 'f';});
        System.out.println("-------------------------------------------------");


    }

}
interface StudentyChecks{
    boolean test (Studenty s);
}
