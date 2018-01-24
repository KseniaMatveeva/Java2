


import java.io.Serializable;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class C {
   /* static Comparator<String> compare1 = new Comparator<String>() {
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
*/

    public static Comparator<String> normalno (Comparator<String> comp1, Comparator<String> comp2) {
/*
        return (Comparator<String>) (c1, c2) -> {comp1.compare(c1,c2)};
        };
        return (Comparator<String>) (c3, c4) -> {comp2.compare(c3,c4);
        };

*/
        Objects.requireNonNull(comp2);
        return (Comparator<String> & Serializable) (c1, c2) -> {
            int res = comp1.compare(c1, c2);
            return (res != 0) ? res : comp2.compare(c1, c2);
        };
    }

    public static void main(String[] args) {

        ArrayList<String> students1 = new ArrayList<String>();
        ArrayList<String> students2 = new ArrayList<String>();
        ArrayList<String> students3 = new ArrayList<String>();
        ArrayList<Comparator> comparators = new ArrayList<Comparator>();

        students1.add(new String("что"));
        students1.add(new String("нам"));
        students1.add(new String("делать"));
        students2.add(new String("уу"));
        students2.add(new String("ааа"));
        students2.add(new String("dfgd"));

        students3.add(new String("ууvbfc"));
        students3.add(new String("аааcbc"));
        students3.add(new String("dfgdvbv"));
        /*comparators.add(compare1);
        comparators.add(compare2);

        Collections.sort(students1, compare1);
        Collections.sort(students2, compare2);

*/
        System.out.println();
        System.out.println("Отсортированные данные:");
        System.out.println();




        System.out.println(students1);
        System.out.println(students2);
    //   System.out.println(compare1);
   //     System.out.println(compare2);

      //  System.out.println(normalno(compare1, compare2));
        Collections.sort(students1,normalno( (o1, o2) -> {
            if (o1.hashCode() < o2.hashCode()) {
                return -1;
            } else if (o1.hashCode() > o2.hashCode()) {
                return 1;
            } else {
                return 0;
            }
        }, (o3, o4) -> { if (o3.hashCode() < o4.hashCode()) {
        return -1;
    } else if (o3.hashCode() > o4.hashCode()) {
        return 1;
    } else {
        return 0;
    } }));
        
        System.out.println(students1);

    }
}
