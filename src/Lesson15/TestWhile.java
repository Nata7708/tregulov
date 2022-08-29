package Lesson15;
//вывод чисел на экран, пока не встретится число, которое делится и на 3 и на 7
public class TestWhile {
    public static void main(String[] args) {

        boolean b = true;
         int a = 1;

         while (b){
             System.out.println(a);
             if (a% 3== 0 && a%7 == 0) {
                 b = false;
             }
             a++;
         }

    }
}
