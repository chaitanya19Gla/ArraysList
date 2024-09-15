//TWO-POINTER APPROACH OF THE MOSTWATER
import java.util.ArrayList;
public class mostwater2 {
    public static int storeWater(ArrayList<Integer>height){
        int maxwater = 0 ;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int ht = Math.max(height.get(lp) ,height.get(rp));
            int wd = rp - lp ;
            int currwater = ht*wd;
            maxwater = Math.max(maxwater , currwater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(9);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));

    }
}
