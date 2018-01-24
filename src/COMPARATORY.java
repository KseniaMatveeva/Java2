import com.sun.org.apache.xpath.internal.operations.String;


import java.util.Comparator;
        import java.util.ArrayList;
        import java.util.Collections;

public class COMPARATORY {

    static Comparator<String> compare1 = new Comparator<String>() {
        public int compare(String o1, String o2) {

            if (o1.hashCode() < o2.hashCode()) {
                return -1;
            } else if (o1.hashCode() > o2.hashCode()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    static Comparator<String> compare2 = new Comparator<String>() {
        public int compare(String o3, String o4) {

            if (o3.hashCode() < o4.hashCode()) {
                return -1;
            } else if (o3.hashCode() > o4.hashCode()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public static Comparator<String> reverse(Comparator<String> comp1, Comparator<String> comp2) {
        comp1.thenComparing(comp2);
        return comp1;
    };


    public static void main(String[] args) {

        ArrayList<String> students1 = new ArrayList<String>();
        ArrayList<String> students2 = new ArrayList<String>();
        ArrayList<Comparator> comparators = new ArrayList<Comparator>();

        students1.add(new String());
        students1.add(new String());
        students1.add(new String());
        students2.add(new String());
        students2.add(new String());
        students2.add(new String());
        comparators.add(compare1);
        comparators.add(compare2);

        Collections.sort(students1, compare1);
        Collections.sort(students2, compare2);


        System.out.println();
        System.out.println("Отсортированные данные:");
        System.out.println();
/*
        System.out.println(students1);
        System.out.println(students2);
        */
        System.out.println(reverse(compare1, compare2));

    }
}
