package Lesson8;

public class Circle {

    static double proizvedenie(double a, double b, double c) { // ����������� �����, ������������ ������������ 3 ����� �� ���� ������
        return a * b * c;
    }

    static void delenie(int a, int b) { //����������� �����, ���������� �������� � �������� �� �������
        System.out.println("����� ������� " + a / b + "; ������� ������� " + a % b);
    }
}
    class CircleTest{ // ��������� ��������� ������ � ����� ������
        public static void main(String[] args) {
            System.out.println(Circle.proizvedenie(5,6,7));
            Circle.delenie(79,16);
            System.out.println(Circle.proizvedenie(18,5,9));
            Circle.delenie(897,11);
        }

    }




