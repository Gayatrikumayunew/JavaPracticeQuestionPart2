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
public class _104dublicateRemoveLL {
     private Node head;
    private Node tail;

    public static void main(String[] args) {
           _104dublicateRemoveLL list=new _104dublicateRemoveLL();
           list.insertAtFirst(1);
           list.insertAtFirst(1);
           list.insertAtFirst(1);
           list.insertAtFirst(2)
                   ;
           list.insertAtFirst(3);
           list.insertAtFirst(3);
           list.insertAtFirst(4);
           list.insertAtFirst(5);
           list.display();
           list.dublicates();
           list.display();
    }
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
            public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("END");
                System.out.println("");
    }

    public void insertAtFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
 
        if(tail==null){
            tail=head;
        }
    }

    public void dublicates(){
        Node node=head;
        while(node.next != null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
}
