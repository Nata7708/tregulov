package Lesson5;
//������ � �������������
public class Emloyee {
    int id;
    public String surname;
    int age;
    double salary; //���� � ������ ��������� private, �� ���������� ����� ����� ������ ������ ������ ������
    String department; //����������, ��������, ������� ����� ������������ � ������������

       Emloyee(int id2, String surname2, int age2, double salary2, String department2) {   //��������� ����������� � ��������� ��� � ������
           id = id2;                                                                        // ����������� �������� ���� ����������
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


// ����� ��� ���������� �������� �����
        double salaryPlus() {
            salary*=2;
            return salary;
        }
    }

class EmployeeTest{
    public static void main(String[] args) {
        Emloyee Emp1 = new Emloyee(25,"Ivanova",45,200000,"Middle");
        Emloyee Emp2 = new Emloyee(26,"Dulin",35,10000,"Start");
        System.out.println("�������� ���������� "+Emp1.surname+" �� ���������� "+Emp1.salary) ;
        System.out.println("�������� ���������� "+Emp2.surname+" �� ���������� "+Emp2.salary)  ;
        System.out.println() ;
        System.out.println("����������� �������� �����");
        Emp1.salaryPlus();
        Emp2.salaryPlus();
        System.out.println("�������� ���������� "+Emp1.surname+" ����� ���������� "+Emp1.salary) ;
        System.out.println("�������� ���������� "+Emp2.surname+" ����� ���������� "+Emp2.salary) ;
    }
}





