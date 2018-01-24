/*
11. Using the list(FilenameFilter) method of the java.io.File class, write a method that returns all files
 in a given directory with a given extension. Use a lambda expression, not a FilenameFilter.
 Which variable from the enclosing scope does it capture?
11. Используя метод listen (FilenameFilter) класса java.io.File, напишите метод, который возвращает
все файлы в заданном каталоге с заданным расширением. Используйте выражение лямбда, а не FilenameFilter.
Какую переменную из области охвата она захватывает?

 */

import java.io.File;
import java.io.FilenameFilter;//нужные библиотеки
public class Task11 {

    public static void main(String[] args) {//тельце
        File dir = new File("/Users/Ksu/Desktop/9 семестр ");
// задаем директорию любую свою где есть документы
        for (String file : dir.list((directory, name) -> name.endsWith(".jpg"))) { // наше лямбда выражение
            System.out.println(file); //выводим все файлы в заданном формате
        }
    }
}