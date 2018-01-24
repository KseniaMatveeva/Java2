/*import static java.lang.System.*;

interface A {
    default String foo(){
        return "Calling A.foo()";
    }
}

interface B {
    default String foo(){
        return "Calling B.foo()";
    }
}


public class dop22 implements A,B {



         public String foo() {
        return A.super.foo();}
}
    public static void main(String[] args) {
        dop22 a = new dop22();
        System.out.println(foo());
    }
    */