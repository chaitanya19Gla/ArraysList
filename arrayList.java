import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);  //ADD OPERATION
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        //______________________________

        int element = list1.get(3);
        System.out.println(element);        //GET OPERATION

        //______________________________

        list1.remove(3);
        System.out.println(list1);          //GET REMOVE

        //______________________________

        list1.set(2,10);
        System.out.println(list1);         //SET OPE.

        //______________________________

        for(int i = 0 ; i<list1.size() ; i++){
            System.out.println(list1.get(i));     //SIZE OP
        }



    }
}
