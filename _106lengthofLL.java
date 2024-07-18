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
public class _106lengthofLL {
        private Node head;
    private Node tail;
    private class Node{
       private  int val;
        private Node next ;
        
        public Node(int val){
            this.val=val;
        }
    
    public Node (int val,Node next){
        this.val=val;
        this.next=next;
        
    }}

    public static void main(String[] args) {
        //do urself
    }
    public int hasCycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
//calculating length
Node temp=slow;
int length=0;
do{
    temp=temp.next;
    length++;
}
while(temp!=slow);
return length;
            }
        }
        return 0 ;
    }
    //finding length
    
}
