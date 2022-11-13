package com.aayush.gulia.LinkedList.Questions;

import com.aayush.gulia.LinkedList.List;

import java.util.HashMap;

public class DetectCycle {

    /**
     *
     * Use two pointers to detect cycle in a linked list,
     * (slow & fast) pointers.
     * @param first Linked list
     * @return boolean
     */

    static boolean detectCycleUsingPointers(List.Node first){
        List.Node slow = first;
        List.Node fast = first;

        while (fast != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }

    /**
     * Detect cycle using hashmap.
     * @param first Linked list.
     * @return boolean
     */
    static boolean detectCycleUsingHash(List.Node first){
        HashMap<List.Node, Integer> map = new HashMap<>();
        List.Node temp = first;

        while (temp != null){
            if (map.containsKey(temp)){
                return true;
            }

            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        List.Node first = List.createSinglyLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10});
        List.Node temp = first;
        for (int i=0; i<4; i++){
            temp = temp.next;
        }
        temp.next = first;

        System.out.println(detectCycleUsingPointers(first));
//        List.display(first);
    }
}
