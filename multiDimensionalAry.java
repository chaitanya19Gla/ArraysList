import java.util.ArrayList;
public class multiDimensionalAry {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list.add(list1);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(9);
        list2.add(11);

        for(int i = 0 ; i<list.size() ; i++){
            ArrayList<Integer>clist = list.get(i);
            for (int j = 0 ; j<clist.size(); j++){
                System.out.print(clist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(list);


    }
}
