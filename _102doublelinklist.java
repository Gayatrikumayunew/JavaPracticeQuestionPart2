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
public class _102doublelinklist {
    Node head;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        
    }
    public void display(){
        Node node=head;
         Node last=null;
        while(node!=null){
           
            System.out.print(node.val+"<==>");
            last=node;
            node=node.next;
        }
        System.out.println("End");
        System.out.println("printing in reverse");
        while(last !=null){
            System.out.print(last.val+"<==>");
            last=last.prev;
        }
        System.out.println("Start");
    }
    public void insertlast(int val){
                Node node =new Node(val);

        Node temp=head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        node.prev=temp;
        
        
        
    }
    // insert after a value
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert(int after ,int val){
        Node p= find(after);
        if(p==null){
            System.out.println("not exist");
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
        
    }
    private class Node{
        int val;
        Node next;
        Node prev;
             public Node(int val){
             this.val=val;}

        
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    
    public static void main(String[] args) {
        _102doublelinklist list=new _102doublelinklist();
        list.insertfirst(5);
        list.insertfirst(4);list.insertfirst(3);list.insertfirst(2);
        list.insertfirst(1);
        list.display();
        
        list.insertlast(6);
                list.display();
                list.insert(2, 45);
                list.display();

    }
        
}
