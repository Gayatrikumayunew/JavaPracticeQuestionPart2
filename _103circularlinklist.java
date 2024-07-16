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
public class _103circularlinklist {
    public static void main(String[] args) {
        _103circularlinklist list=new _103circularlinklist();
        list.insert(5);
        list.insert(15);
        list.insert(51);
        list.insert(125);
        list.Display();
        list.delete(51);
        list.Display();
        
    }
    private Node head;
    private Node tail;
    
    public _103circularlinklist(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        
        
    }
    public void Display(){
        Node node=head;
        if(head !=null){
            do{
                System.out.print(node.val+"-->");
                node=node.next;
            }while(node!=head);
        }
        System.out.println("Head");
    }
    
    private class Node{
        int val;
        Node next;
        
        public Node (int val){
            this.val=val;
        }
    }
    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
            break;
        }
        while(node!=head);
    }
}
