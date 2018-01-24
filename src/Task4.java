/*
4. Implement a static of method of the IntSequence class that yields a sequence with the arguments.
For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values. Extra credit if you
 return an instance of an anonymous inner class.
 4. Внедрить статику метода класса IntSequence, который дает последовательность с аргументами.
  Например, IntSequence.of (3, 1, 4, 1, 5, 9) дает последовательность с шестью значениями.
  Дополнительный кредит, если вы возвращаете экземпляр анонимного внутреннего класса.
 */
public class Task4 {

    public static void main(String[] args) {//тельце
        IntSequence sequence = IntSequence.of(0, 22, 64, 91, 99);//Интсекуэнс БЕРЕТСЯ ИЗ ЗАДАНИЯ 5!!!! только уже не с 1 числом

        while (sequence.hasNext()) { //пока у нас есть чем заполнить
            System.out.println(sequence.next());//выводим по чиселке
        }
    }
}
