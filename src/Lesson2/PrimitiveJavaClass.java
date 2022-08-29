package Lesson2;

public class PrimitiveJavaClass {
    public static void main(String[] args) {
        int i1 = 5;
        int i2=11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2/d1+d2%i1-l;
        System.out.println(result);
        int a = 5;
        System.out.println(a-- - --a + ++a + a++ + a);
        int b = 8;
        System.out.println(++b - b++ + ++b - --b);


    }
}
