/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: FindDuplicateInArray
 * IDENTIFY- Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 * DEFINE- Because each integer is between 1 and n, and there can only be a duplicate in an array of size n+1
 * there has to be at least 1 duplicate.
 * EXPLORE- The duplicate will be the sum of the array - (length of the array - 1 + "" - 2 + etc...).
 * I also wanted to use a method that calculates te sum of an array, so that was through streams.
 * ANTICIPATE-Anticipating time complexity to be that of the stream sum to be O(n) and the n+ n-1 + n-2+...
 * should result to O(n) time.
 *
 * LOOKBACK-
 * Notes: I like this solution, however I never created it if it would work on arrays of size 1, but it did (:
 */
import java.util.stream.*;
public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] A = {3,1,3,4,2};
        System.out.print(findDuplicate(A));
    }

    public static int findDuplicate(int[] a){
        int sum = IntStream.of(a).sum();
        int num = 0;
        for(int i = 1; i < a.length; i ++){
            num = num + i;
        }
        return sum - num;
    }
}
