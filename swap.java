import java.util.*;

public class swap {
    public static void swape(ArrayList<Integer>list, int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(6);
        list1.add(3);
        list1.add(45);
        list1.add(78);

        int idx1 = 45 ;
        int idx2 = 78 ;
        System.out.println(list1);
        swape(list1 ,idx1 ,idx2);
        System.out.println(list1);




    }
}
