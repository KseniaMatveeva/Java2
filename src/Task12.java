/*
12. Given an array of File objects, sort it so that directories come before files,
and within each group, elements are sorted by path name. Use a lambda expression to specify the Comparator.
12. Учитывая массив объектов File, сортируйте его так, чтобы каталоги приходили перед файлами,
 а внутри каждой группы элементы сортировались по имени пути. Для определения компаратора используйте выражение лямбда.
 */
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;//нужные импорты

public class Task12 {
    public static void main(String[] args) {//тельце
        File dir = new File("/Users/Ksu/Desktop/9 семестр ");
//вводим любую директорию в которой есть именно файлы какие-либо
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.println(file);//выводим все файлы которые нашлись в данной директории
        }
 Comparator<File> am = (File o1, File o2) -> {//сортируев массив из найденных файлов
     if (o1.isDirectory() && o2.isDirectory()) { //берем по два обьекта -- если они оба являются директориями то
         return o1.getName().compareTo(o2.getName());//сравниваем имя первого обьекта с именем второго обьекта и ставим по возрастанию
     } else if (o1.isDirectory() && !o2.isDirectory()) {//если первый обьект директория а второй обьект обычный документ
         return -1;//то не сравниваем ибо у нас выводятся сначала директории а потом все остальные файлы
     } else if (!o1.isDirectory() && o2.isDirectory()) {//если первый обьект обычный документ а второй директория -- аналогично
         return 1;//не сравниваем а возвращаем 1
     } else {
         return o1.getName().compareTo(o2.getName());//если оба обьекты у нас обычные файлы то опять сравниваем имена
     }
 };

        int i = am.compare(null,null);

        Arrays.sort(files,am);

        System.out.println();//строчка для разделения

        for (File file : files) {
            System.out.println(file); //выводим наши отсортированные файлики
        }
    }
}