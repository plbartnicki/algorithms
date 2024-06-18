package middleoflinkedlist;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    static int getMiddleElementOfLinkedList (ListNode list) {
        int numOfElements = 0;
        ListNode temp = list;

        while(temp != null) {
            numOfElements++;
            temp = temp.next;
        }

        int position = 0;
        if(numOfElements % 2 != 0) {
            position = (numOfElements + 1) / 2;
        } else {
            position = numOfElements / 2;
        }

        temp = list;
        int i = 1;
        int value = -1;
        while(i <= position) {
            i++;
            value = temp.data;
            temp = temp.next;
        }

        return value;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(3);
        l11.next = null;
        System.out.println(getMiddleElementOfLinkedList(l11) == 3);

        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(5);
        l21.next = l22;
        l22.next = l23;
        l23.next = null;
        System.out.println(getMiddleElementOfLinkedList(l21) == 4);

        ListNode l31 = new ListNode(3);
        ListNode l32 = new ListNode(4);
        ListNode l33 = new ListNode(5);
        ListNode l34 = new ListNode(6);
        l31.next = l32;
        l32.next = l33;
        l33.next = l34;
        l34.next = null;
        System.out.println(getMiddleElementOfLinkedList(l31) == 4);

    }
}
