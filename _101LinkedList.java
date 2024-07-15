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
public class _101LinkedList {
    private Node head;
    private Node tail;
    
    private int size;
    public _101LinkedList(){
        this.size=0;
    }
    public void insertAtFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
 
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("END");
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
    public void insertlast(int val){
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
        
    }
    
    public void insert(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            
            
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
        
        
    }
// deletion operations    
// deletion at first
    public int delete_at_first(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
        
    }
     public void delete_at_first1(){
//        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return ;
        
    }
     // delete at taik
     public int deletetail(){
         if(size<=1){
             return delete_at_first();
         }
         Node secondlast=get(size-3);
         int val=tail.val;
         tail=secondlast;
         tail.next=null;
         return val;
     }
     public Node get(int index){
         Node node=head;
         for(int i=0;i<index;i++){
             node=node.next;
         }
         return node;
     }
     // delete at index
     
     public int deleteatindex(int index){
         if(index==0){
             return delete_at_first();
         }
         if(index==size-1){
             return deletetail();
         }
         Node prev=get (index-1);
         int val=prev.next.val;
         prev.next=prev.next.next;
         return val;
     }
    public static void main(String[] args) {
     _101LinkedList list=new _101LinkedList();
     list.insertAtFirst(0);
     list.insertAtFirst(1);
     list.insertAtFirst(2);
          list.insertAtFirst(3);
     list.insertAtFirst(4);
     list.insertlast(44);
     list.insert(200,2);
//        System.out.println(list.delete_at_first());
        list.delete_at_first1();
     list.display();
     list.deletetail();
     list.display();
        System.out.println("index deletion");
list.deleteatindex(2);
     list.display();


    }
}
