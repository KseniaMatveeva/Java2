/* import java.util.Arrays;
import java.util.Comparator;

public class Dop4 {
    public static class Task20 implements Measurable {

        @Override
        public String toString() { //так мы задаем работника, которому добавляем имя и зарплату
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }

        private String name;
        private double salary;
        private int age;

        public Task20(String name, double salary, int age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }
        public String getName() {
            return name;
        } //получить имя

        public void setName(String name) {
            this.name = name;
        } //задать имя

        public double getSalary() {
            return salary;
        } //получить зарплату

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public int getAge() {
            return age;
        } //получить имя

        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public double getMeasure() {
            return salary;
        }

        public static Comparator<String> reverse(Comparator<String> comp1, Comparator<String> comp2) {
            Comparator<String> comp3 = Comparator.comparingInt(String::hashCode).thenComparing(Task20::getName());
        }

    }
    public static void main(String[] args) { //наша основная функция
        Task20[] employees = { //задаем наших работников и их зарплаты (Employee - Task1 захотелось мне так)
                new Task20("Vasya", 10,18),
                new Task20("Anya", 10,17),
                new Task20("Lena", 1000,24),
                new Task20("Andrey", 10,27),
                new Task20("Luyba", 10,23),
                new Task20("Alyosha", 10000,21),
                new Task20("Anya",10,26)

        };

        Arrays.sort(employees, Comparator.comparing(Task20::getSalary)
                .thenComparing(Comparator.comparing(Task20::getName)).thenComparing(Comparator.comparing(Task20::getAge))); // а затем по имени , то есть если зп будет одинаковая
//то он отсортируем по имени
        for (Task20 e : employees) {
            System.out.println(e); //выводим наш отсортированный массивчик
        }
        System.out.println();//добавляем пустую строку чтобы разделить наш следующий массив

    }
}


*/