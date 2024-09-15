import java.util.*;
public class MostWater {
    public static int maxwater(ArrayList<Integer>height){
        int max_Water = 0 ;
        for (int i = 0 ; i<height.size() ; i++){
            for (int j = i+1 ; j<height.size() ; j++){
                int ht = Math.min(height.get(i) , height.get(j));
                int wd = j - i ;
                int curr_water = ht * wd;
                max_Water = Math.max(max_Water , curr_water);
            }
        }
        return max_Water;


    }

    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(9);
        height.add(3);
        height.add(7);

        System.out.println("Max water as per given parameters is = " + maxwater(height));


    }
}
