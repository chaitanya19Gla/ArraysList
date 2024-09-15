import java.util.ArrayList;
//import java.util.Scanner;
//
public class pair_sum_1 {
    public static boolean PSum(ArrayList<Integer> list , int n) {
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == n) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < n) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(1);
        list.add(3);

        System.out.println(PSum(list , 4));


    }
}


