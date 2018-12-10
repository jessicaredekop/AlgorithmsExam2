import java.util.LinkedList;

/**
 * Course: Algorithms
 * Author: Jessica Redekop
 * Assignment: LeetCode15MProblemSet
 * Instructor: Diego Aguirre
 *
 * ----------------------------IDEAL PROCESS----------------------------
 * class: OddEvenLinkedList
 * IDENTIFY-Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes
 * difference between any two time points in the list.
 * DEFINE- There are only two differences in a 24 hour clock time. Iterating thrugh time forwards and backwards,
 * We have to return the minimum time.
 * EXPLORE- Traverse list until you find an even number, keep that node in a 2nd head, keep traversing list whilst
 * adding the even nodes to the head of the first even, and the odds as the next to the first list, then once
 * the list is null, concatonate the even's list head to the tail of the odd's list.
 * ANTICIPATE- I anticipate the time-complexity of this to be O(n).
 *
 * LOOKBACK-
 * Notes: Nothing new in thi algorithm
 */

class OddEvenLinkedList{


    public static ListNode oddEvenList(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
