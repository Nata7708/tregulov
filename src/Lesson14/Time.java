package Lesson14;

public class Time {
    public void time () {
       for (int chas = 0; chas <=23; chas++) {
           for (int minuta = 0; minuta <=59; minuta++){
               if (minuta==30) {break;} //прерывает цикл на 30 минутах
               for (int secunda = 0; secunda <=59; secunda++){
                   System.out.println(chas +":"+ minuta +":" +secunda);
               }
           }
       }
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.time();
    }
}
