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
public class _114circularQueue {
    public static void main(String[] args) {
        _114circularQueue e=new _114circularQueue();
        e.insert(78);
        e.insert(45);
        e.insert(12);
        e.insert(432);
        e.printing();
        try{
            
        
        e.remove();
            System.out.println(  e.front());}
        
        catch(Exception ef){
            System.out.println("ec");
        }
                e.printing();

    }
        public int[] data;
    public static final int DEFAULT_SIZE=10;
    int end=0;
    int front =0;
    int size=0;
    public _114circularQueue(){
        this(DEFAULT_SIZE);
    }
    public _114circularQueue(int size){
        this.data =new int[size];
        
    }
        public boolean isFull() {
        return size == data.length ;//means we are at last index
    }

    public boolean isEmpty() {
        return end == 0;//means we are at last index
    }
    public boolean insert (int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;// first add the item on end then increase
        return true;
    }
    public boolean insert1 (int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
end=end%data.length;
size++;
        return true;
    }
public int remove()throws Exception{
    if(isEmpty()){
        throw new Exception ("Queue is Empty can't remove anything");
        
    }
    int removed=data[front++];
    front=front%data.length;
    size--;
    return removed;
}
public int front() throws Exception{
    if(isEmpty()){
        throw new Exception ("Queue is empty");
        
    }
    return data[front];
}
public void printing(){
    for(int i=front;i<end;i++){
        System.out.print(data[i]+" -->");
    }
    System.out.println("END");
}

}
