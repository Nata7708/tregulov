package CollectionsArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Ivan");
        arrayList1.add("Petr");
        arrayList1.add("Maria");
        arrayList1.add(1,"Sveta"); //добавление на определенную позицию
        for(String s: arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList1.get(2)); //выводит элемент с указанным индексом

        for(int i = 0; i<arrayList1.size(); i++){ //вывести все эллементы массива
            System.out.print(arrayList1.get(i) + " ");
        }

        System.out.println();

        arrayList1.set(1, "Dima"); //заменяет один элемент на другой по индексу
        System.out.println(arrayList1);

        arrayList1.remove(0);//удаление по индексу
        System.out.println(arrayList1);
    }

}
