public class ClassA {
    public static class ClassB implements Int1, Int2 {
        @Override
        public void getMeas() {
            System.out.println("что-то"); //выводим среднюю зарплату

        }
    }

    interface Int1 {
        void getMeas();
    }

    interface Int2 {
        void getMeas();
    }

    public static void main(String[] args) {
        ClassB s = new ClassB();
         s.getMeas();
    }
}
