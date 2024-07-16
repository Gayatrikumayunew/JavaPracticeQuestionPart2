/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author gayatri
 */
public class _105MergeLL {

    private Node head;
    private Node tail;

    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;

        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println("");
    }

    public void insertlast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

    }

    public static void main(String[] args) {
        _105MergeLL list1 = new _105MergeLL();
        _105MergeLL list2 = new _105MergeLL();
        list1.insertlast(1);
        list1.insertlast(3);
        list1.insertlast(5);
        list2.insertlast(1);
        list2.insertlast(2);
        list2.insertlast(3);
        list2.insertlast(9);
        list1.insertlast(14);
        _105MergeLL ans = _105MergeLL.merge(list1, list2);
        list1.display();
        list2.display();
        System.out.println("After merging"
                + "");

        ans.display();

    }

    public static _105MergeLL merge(_105MergeLL first, _105MergeLL second) {
        Node f = first.head;
        Node s = second.head;

        _105MergeLL ans = new _105MergeLL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertlast(f.val);
                f = f.next;
            } else {
                ans.insertlast(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertlast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertlast(s.val);
            s = s.next;
        }
        return ans;
    }
}
