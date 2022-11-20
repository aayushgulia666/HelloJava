package com.aayush.gulia.LinkedList.Questions;

import com.aayush.gulia.LinkedList.List;

import java.util.ArrayList;
import java.util.Collections;

public class CheckForPalindromicLinkedList {
    public static void main(String[] args) {
        List.Node first = List.createSinglyLinkedList(new int[]{1,2,2,1});
        System.out.println(isPalindrome(first));

    }

    /*
    @TODO: implement solution having space complexity of O(1).
     */

    public static boolean isPalindrome(List.Node head){
        // T:O(n) , S:O(n)
        ArrayList<Integer> ls = new ArrayList<>();
        List.Node p = head;

        while (p != null){
            ls.add(p.data);
            p=p.next;
        }

        int i=0;
        Collections.reverse(ls);

        while (head != null){
            if (ls.get(i) != head.data){
                return false;
            }
            i++;
            head=head.next;
        }
        return true;
    }
}
