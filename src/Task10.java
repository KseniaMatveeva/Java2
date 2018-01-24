/*
10. Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
write a method that returns all subdirectories of a given directory.
 Use a lambda expression instead of a FileFilter object. Repeat with a method expression and an anonymous inner class.
 10. Используя методы listFiles (FileFilter) и isDirectory класса java.io.File,
 напишите метод, который возвращает все подкаталоги данного каталога.
 Используйте лямбда-выражение вместо объекта FileFilter.
 Повторите с помощью выражения метода и анонимного внутреннего класса.
 */
import java.io.File;
import java.io.FileFilter;//нужные импорты

public class Task10 {

    public static void main(String[] args) {//тельце
        File dir = new File("/Users/Ksu/Desktop/9 семестр ");//вставить свой путь к любой папке в которой что то есть

        for (File d : dir.listFiles((f) -> f.isDirectory())) {     //используем лямбда выражения
            System.out.println(d);//вывод
        }

        System.out.println();//для разделения

        for (File d : dir.listFiles(File::isDirectory)) {       //используем выражение метода
            System.out.println(d);//вывод
        }

        System.out.println();//для разделения

        for (File d : dir.listFiles(new FileFilter() { //используя анонимный класс
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            } //если правильное название пути то
        })) {                                                                       // возвращает все директории
            System.out.println(d);//вывод
        }
    }

}