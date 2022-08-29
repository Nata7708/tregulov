package Lesson8;

public class Circle {

    static double proizvedenie(double a, double b, double c) { // статический метод, возвращающий произведение 3 числе из тела метода
        return a * b * c;
    }

    static void delenie(int a, int b) { //статический метод, показывает частоное и осотаток от деления
        System.out.println("Целое частное " + a / b + "; Остаток деления " + a % b);
    }
}
    class CircleTest{ // применяем созданные методы в новом классе
        public static void main(String[] args) {
            System.out.println(Circle.proizvedenie(5,6,7));
            Circle.delenie(79,16);
            System.out.println(Circle.proizvedenie(18,5,9));
            Circle.delenie(897,11);
        }

    }




