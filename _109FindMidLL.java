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
public class _109FindMidLL {
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
public Node mid(Node head){
    Node s=head;
    Node f=head;
    while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
    }
    return s;
}
}
