package Lesson4;

 public class Student {
     int studentID; // объявление переменных
     String firstName;
     String lastName;
     int year;
     double math;
     double economic;
     double language;

      Student (int studentID2, String firstName2, String lastName2, int year2, double math2, double economic2, double language2) {
         studentID = studentID2;
         firstName = firstName2;
         lastName = lastName2;
         year = year2;
         math = math2;
         economic = economic2;
         language = language2; // создание через конструктор 1
     }

     Student (int studentID3, String firstName3, String lastName3, int year3) {
          this (studentID3, firstName3, lastName3, year3, 0, 0, 0);
          // конструктор в конструкторе , метод this

     }

     Student () {

     } // пустой конструктор


     double srednee (double math,double economic,double language) {
         double result = ((math + economic + language) / 3);
         return result;
     }
     }

    class StudentTest{

        public static void main(String[] args) {

            Student st1 = new Student(); // создание объектов

            st1.studentID = 1;
            st1.firstName = "Ivan";
            st1.lastName = "Ivanov";
            st1.year = 2020;
            st1.math = 4.5;
            st1.economic = 4.0;
            st1.language = 4.6;

            Student st2 = new Student();
            st2.studentID = 1;
            st2.firstName = "Petr";
            st2.lastName = "Petrov";
            st2.year = 2021;
            st2.math = 5.0;
            st2.economic = 4.1;
            st2.language = 3.8;

            Student st3 = new Student();
            st3.studentID = 1;
            st3.firstName = "Sidor";
            st3.lastName = "Sidorov";
            st3.year = 2022;
            st3.math = 3.4;
            st3.economic = 4.8;
            st3.language = 3.9;

            Student srednee1 = new Student();

            Student st4 = new Student(); // создание объекта  через пустой конструктор
            st4.studentID = 4;
            st4.firstName = "Dimon";
            st4.lastName = "Dimonov";
            st4.year = 2021;
            st4.math = 4.9;
            st4.economic = 5.0;
            st4.language = 4.2;

            Student st5 = new Student(5, "Elena", "Svetlova", 2020); // через конструктор в конструкторе
            st5.math = 4.8;
            st5.economic = 4.9;
            st5.language = 5.0;

            Student st6 = new Student(6, "Olga", "Olgina", 2021, 4.1, 4.3 ,3.9);//через полный конструктор


            System.out.println("Средняя оценка студента " + st1.firstName + " " + st1.lastName + "=" + srednee1.srednee(st1.math, st1.economic, st1.language));
            System.out.println("Средняя оценка студента " + st2.firstName + " " + st2.lastName + "=" + srednee1.srednee(st2.math ,st2.economic ,st2.language));
            System.out.println("Средняя оценка студента " + st3.firstName + " " + st3.lastName + "=" + srednee1.srednee(st3.math,st3.economic,+ st3.language));

            System.out.println("Средняя оценка студента " + st4.firstName + " " + st4.lastName + "=" + srednee1.srednee(st4.math,st4.economic,+ st4.language));
            System.out.println("Средняя оценка студента " + st5.firstName + " " + st5.lastName + "=" + srednee1.srednee(st5.math,st5.economic,+ st5.language));
            System.out.println("Средняя оценка студента " + st6.firstName + " " + st6.lastName + "=" + srednee1.srednee(st6.math,st6.economic,+ st6.language));

        }

        }





