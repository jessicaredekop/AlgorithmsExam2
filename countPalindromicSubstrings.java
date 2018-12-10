/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: countPalindromicSubstrings
 * IDENTIFY- Find all palindromes in a given string
 * DEFINE- The palindromes can be of length 1, they also don't have to be in the center of the word.
 * EXPLORE- I think if you start at the beginning and check if there is a palindrome from that index.
 * you can count how many palindromes there are until there is an instance where the work is not a
 * palindrome anymore.
 * ANTICIPATE-Anticipating time complexity to be O(n^2), and the solution must always be AT LEAST the
 * length of the string.
 *
 * LOOKBACK-
 * Notes: I was able to solve this problem by deconstructing the smallest problem and modifying it for
 * a larger string.
 */
public class countPalindromicSubstrings {

    public static void main(String[] args) {
        String str = "haahaha";
        System.out.println("countPalindromicSubstrings Method:\nThere are " + countPSubstrings(str) + " on the string " + str);
        System.out.println();
    }

    public static int countPSubstrings(String s){
        int numPSubstrings = 0;
        for (int middle = 0; middle <= (s.length()-1)*2; middle++) {
            int left = middle / 2;
            int right = left + middle % 2;
            while (left >= 0 && right < s.length() && sameEnds(s.substring(left,right))) {
                numPSubstrings++;
                left--;
                right++;
            }
        }
        return numPSubstrings;
    }

    public static boolean sameEnds(String s) {
        if(s.equals("")) return false;
        else if(s.charAt(0) == s.charAt(s.length()-1))
            return true;
        return false;
    }
}
