package Lesson14;
/*������� ������ � ������ ��������� �����, ������� ������� �� ����� ����� � ������� "���:������:�������".
�������� �� 0 �� 6 �����.
���� ��� ������ 1 � ������� ������ 10, ����� �������������.
���� ������� ���������� �� ��� ������� ������, ������� �� ������ ������
(��������� �����, for, break, continue)
 */
public class TestTime {
    static void Vremia () {
        for (int chas = 0; chas < 6; chas++) {

            for (int minuta = 0; minuta <60; minuta++){
                if (chas > 1 && minuta%10==0) {
                    break;
                }

                for (int secunda = 0; secunda <60; secunda++){
                    if (secunda*chas > minuta){
                        continue;
                    }

                    System.out.println(chas +":"+ minuta +":" +secunda);
                }
            }
        }
    }

    public static void main(String[] args) {
               Vremia();
    }
}
