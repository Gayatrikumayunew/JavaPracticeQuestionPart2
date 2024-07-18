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
public class _107detectCycleLL {
        private Node head;

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
 public Node cycle(Node head){
     int length=0;
     Node fast=head;
     Node slow=head;
     while(fast!=null && fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
         if(fast==slow){
             length=hasCycle(slow);
             break;
         }
     }
     //find the start node
     Node f=head;
     Node s=head;
     while(length>0){
         s=s.next;
         length--;
     }
     // keep moving both forward tehy will meet at position
     while(f!=s){
         f=f.next;
         s=s.next;
     }
     return s;
 }
}
