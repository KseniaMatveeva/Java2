import static java.lang.System.*;
interface Interface1 {
    default void hello() { System.out.println("Hello World from A"); }
}

interface Interface2 extends Interface1
{
    @Override
    default void hello() {System.out.println("Hello world from B");
    }
}
interface Interface3 extends Interface1
{
    @Override
    default void hello() {
        System.out.println("Hello world from C");
    }

}

public class Dop2 implements Interface1,Interface2,Interface3 {

    public void hello() {
        Interface2.super.hello();
    }
    public static void main(String[] args) {
        Dop2 a = new Dop2();
        a.hello();
    }

}
/*
import static java.lang.System.*;
interface Interface3 {
default void hello() { System.out.println("Hello World from A"); }
}

interface Interface1 extends Interface3
{
@Override
default void hello() {System.out.println("Hello world from B");
}
}
interface Interface2 extends Interface3
{
@Override
default void hello() {
System.out.println("Hello world from C");
}

}

public class dop2 implements Interface1,Interface2,Interface3 {

public static void main(String[] args) {
dop2 a = new dop2();
a.hello();
}

}
*/
