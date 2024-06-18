package loopinlinkedlist;

import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main {
    //zwraca node w ktorym zaczyna sie petla
    static ListNode getStartingNodeOfLoop(ListNode list){
        if(list == null) {
            return null;
        }

        Set<ListNode> visitedNodes = new HashSet<>();
        ListNode temp = list;

        ListNode result = null;
        while(temp != null) {

            if( visitedNodes.contains(temp)) {
                result = temp;
                break;
            }

            visitedNodes.add(temp);
            temp = temp.next;
        }

        if(temp == null) {
            return null;
        }

        return result;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        ListNode res1 = getStartingNodeOfLoop(n1);
        if(res1 != null)
            System.out.println(res1.data);
    }
}
