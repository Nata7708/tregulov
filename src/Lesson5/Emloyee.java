package Lesson5;
//работа с конструктором
public class Emloyee {
    int id;
    public String surname;
    int age;
    double salary; //если в начале поставить private, то переменна€ будет видна только внутри своего класса
    String department; //переменные, значени€, которых будут приваиватьс€ в конструкторе

       Emloyee(int id2, String surname2, int age2, double salary2, String department2) {   //создаетс€ конструктор с названием как у класса
           id = id2;                                                                        // присваиваем значени€ всем переменным
           surname = surname2;
           age = age2;
           salary = salary2;
           department = department2;
       }

       public void getID () {
           System.out.println ("ID = "+ id);
           }
       public void getSurname() {
           System.out.println("Surname: "+surname);
           }
       public void getSalary() {
           System.out.println("Salary: " + salary);
           }


// метод дл€ увеличени€ зарпланы вдвое
        double salaryPlus() {
            salary*=2;
            return salary;
        }
    }

class EmployeeTest{
    public static void main(String[] args) {
        Emloyee Emp1 = new Emloyee(25,"Ivanova",45,200000,"Middle");
        Emloyee Emp2 = new Emloyee(26,"Dulin",35,10000,"Start");
        System.out.println("«арплата сотрудника "+Emp1.surname+" до увеличени€ "+Emp1.salary) ;
        System.out.println("«арплата сотрудника "+Emp2.surname+" до увеличени€ "+Emp2.salary)  ;
        System.out.println() ;
        System.out.println("”величиваем зарплату вдвое");
        Emp1.salaryPlus();
        Emp2.salaryPlus();
        System.out.println("«арплата сотрудника "+Emp1.surname+" после увеличени€ "+Emp1.salary) ;
        System.out.println("«арплата сотрудника "+Emp2.surname+" после увеличени€ "+Emp2.salary) ;
    }
}





