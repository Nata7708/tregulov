package Lesson15;
//����� ����� �� �����, ���� �� ���������� �����, ������� ������� � �� 3 � �� 7
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
