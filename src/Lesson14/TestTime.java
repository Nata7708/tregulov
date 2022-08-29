package Lesson14;
/*Создать классю В классе статичный метод, который выводит на экран метод в формате "час:минута:секунда".
Интервал от 0 до 6 часов.
Если час больше 1 и секунда кратна 10, метод заканчивается.
Если секунда умноженная на час большге минуты, переход на другую минуту
(Вложенные циклы, for, break, continue)
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
