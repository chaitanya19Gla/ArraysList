import java.util.ArrayList;
//import java.util.Collection;
import java.util.*;
public class sort {
    public static void main(String[] args) {

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(4);
        list1.add(6);
        list1.add(9);
        list1.add(1);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
        list1.sort(Collections.reverseOrder());
        System.out.println(list1);

    }
}
