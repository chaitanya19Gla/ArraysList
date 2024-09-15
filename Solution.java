import java.io.*;
import java.util.*;

public class Solution {

    public static void contiguousarr(int arr[] , int size){
//        Scanner sc = new Scanner(System.in);
//        //arr = sc.nextInt();
//       // Random sc;
//        size = sc.nextInt();
        size = arr.length;
        //arr = sc.nextInt();

        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here += arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        //System.out.println("Largest sum contiguous subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = { -2 ,1 ,-3 ,4, -1 ,2, 1, -5, 4 };
        contiguousarr(arr,size);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}