/*
7. Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp) that keeps calling
  Collections.shuffle on the array list until the elements are in increasing order, as determined by the comparator.
  7. Внедрите метод void luckySort (ArrayList <String>, Компаратор <String> comp), который продолжает звонить
Collections.shuffle в списке массивов до тех пор, пока элементы не будут в порядке возрастания,
как это определено компаратором.
 */
import java.util.ArrayList;
import java.util.Collections;//наши нужные утилиты
import java.util.Comparator;


public class Task7 {

    private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {//задаем что ИССОРТЕД тогда когда массив отсортирован
        for (int i = 0; i < strings.size() - 1; i++) {//делаем цикл, который будет идти до конца строчки
            if (comp.compare(strings.get(i), strings.get(i+1)) > 0)//сравнение итого элемента, если сравнение больше 0 то неотсортирован
                return false;
        }
        return true;//в другом случае массив отсортирован
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {//обьявляем метод Лакисорт

        while (!isSorted(strings, comp)) {//если у нас НЕ ИССОРТЕД (неотсортирован массив) то
            Collections.shuffle(strings);//сортируем сортируем
        }
    }

    public static void main(String[] args) {//главное тело
        ArrayList<String> array = new ArrayList<>();//создаем новый массив
        array.add("мама");// в этих строчках мы записываем в него данные и они будут храниться подряд
        array.add("мыла");
        array.add("раму");
        array.add("мылом");

        System.out.println(array);//просто выводим массив который записали
         luckySort(array,String::compareTo);// сравниваем построчно
        System.out.println(array);//выводим уже отсортированный массив
    }
}