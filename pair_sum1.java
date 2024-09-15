import java.util.ArrayList;
import java.util.Scanner;

public class pair_sum1 {
    public static void PSum(ArrayList<Integer>list){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i<list.size() ; i++){
            for(int j = i+1 ; j<list.size() ; j++){
                if(list.get(i) + list.get(j) == n){
                    System.out.println("(" + i + "," + j +")" );
                }
                else {
                    i++;
                    j++;
                }
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);

        PSum(list);

    }
}
