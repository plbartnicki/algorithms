package largestinbst;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
	/* This is the Node class definition */

    private static Stack<Integer> nums = new java.util.Stack<>();

	static class Node {
		public Node left;
		public Node right;
		public int data;

		public Node(int data) {
			this.data = data;
		}
	}

    private static void toStack(Node root) {
        if(root == null) {
            return;
        }
        toStack(root.left);
        nums.push(root.data);
        toStack(root.right);
    }


    static int findKthLargest(Node root, int k) {
        nums.clear();
        toStack(root);

        int i = 1;
        int res = -1;
        while(i <= k) {
            res = nums.pop();
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(1);
        Node n3 = new Node(4);
        Node n4 = new Node(3);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        int res = findKthLargest(n1, 4);
        System.out.println(res);
    }
}
