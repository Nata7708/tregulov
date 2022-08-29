package Lesson6;

public class FiveOverloadedMethods {

    int summ() {
        int result = 0;
        System.out.println("Summa ravna "+result);
        return result;
    }

    int summ(int a)    {
        int result1 = a;
        System.out.println("Summa ravna "+result1);
        return result1;
    }

    int summ (int b, int c) {
        int result2 = b+c;
        System.out.println("Summa ravna "+result2);
        return result2;
    }

    int summ (int d, int e, int f) {
        int result3 = d+e+f;
        System.out.println("Summa ravna "+result3);
        return result3;
    }

    int summ (int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Summa ravna "+result4);
        return result4;

    }
}
class FiveOverloadedMethodsTest {
    public static void main(String[] args) {
        FiveOverloadedMethods s = new FiveOverloadedMethods();
        s.summ();
        s.summ (3);
        s.summ (3,5);
        s.summ(3,5,7);
        s.summ(3,5,7,11);
    }
}


