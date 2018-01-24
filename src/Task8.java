/*

8. Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target,
where n and target are set in the constructor. Construct two instances with different messages and execute
 them concurrently in two threads.
 8. Внедрите класс Greeter, который реализует Runnable и чей метод запуска печатает n копий «Hello»,
  + target, где n и target заданы в конструкторе. Создайте два экземпляра с разными сообщениями и
   выполните их одновременно в двух потоках.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;//нужные импорты
import java.util.concurrent.Executors;
public class Task8 {

public static class Greeter implements Runnable {  //обьявляем класс Гритер который опирается на Ранэйбл

    private String target; //обьявляем нужные нам переменные
    private int n;

    public Greeter(String target, int n) { //задаем их (helloущик)
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() { //метод ран
        for (int i = 0; i < n; i++) {      //делаем цикл от 0 до введенного n
            System.out.println("Hello, " + target);//выводим Хелло и то что мы напишем
        }
        System.out.println(Thread.currentThread().getId());// выводим номер потока который нам это делал потоки встроены в Runnable
    }
}
        public static void main(String[] args) {//основное тельце
            Greeter g1 = new Greeter("Мир", 1);//задаем параметры
            Greeter g2 = new Greeter("Цветочки", 2);

            /*
            ExecutorService executor = Executors.newFixedThreadPool(2);//говорим что у нас будет 2 потока как в задании

            executor.execute(g1);//выполянем первое г1
            executor.execute(g2);//выполняем второе г2

            executor.shutdown();//закрываем "выполнитель"

             */
            Thread t1 = new Thread(g1);//объявляем потоки
            Thread t2 = new Thread(g2);

            t1.start();//начало первого потока
            t2.start();//начало второго потока


            try {
                t1.join();//выполняем первый поток
                t2.join();//выполянем второй поток
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
}