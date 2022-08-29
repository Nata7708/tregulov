package Lesson8;

 class Circle2 {
    public final static double PI = 3.14;

    public double ploschad (double radius) {
        double p1 = PI * radius * radius;
        return p1;
    }

    public static double dlina (double radius2) {
        double d1 = 2 * PI * radius2;
        return d1;
    }

    public void info (double radius3){
        System.out.println("Радиус "+radius3);
        System.out.println("Площадь круга "+ploschad(radius3));
        System.out.println("Длина окружности "+dlina(radius3));
    }
           }
           class CircleNewTest {
               public static void main(String[] args) {
                Circle2 x = new Circle2();
                x.ploschad(9.9);
                Circle2.dlina(8.1);
                x.info(8.4);
               }

           }



