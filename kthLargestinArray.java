/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: kthLargestinArray
 * IDENTIFY- Find kth largest element in an array.
 * DEFINE- kth largest does not mean index, it means the element itself including duplicates.
 * EXPLORE- I'd like to tamper with Java tools, so I's like to implement Arrays.sort(A) in my algorithm.
 * ANTICIPATE-Anticipating time complexity to be that of Arrays.sort(A) and a O(n) to find the kth element.
 * I know I have to go through the array at least once in order to find what the largest element is.
 *
 * LOOKBACK-
 * Notes: I's use merge sort if I had to sort the array by hand.
 */
import java.util.Arrays;
class kthLargestinArray {
    public static void main(String[] args) {
        int[] A = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(kthLargestElement(A,k));

    }

    public static int kthLargestElement(int[] a, int k) {
        Arrays.sort(a);
        System.out.println();
        if(k == 1)
            return a[a.length-1];
        for(int i = a.length-1; i >= 0; i--){
            if(i == a.length-1) k--;
            else if (!(a[i] == a[i + 1])) k--;
            if (k==1) return a[i];
        }
        return 0;
    }
}
