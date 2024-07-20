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
public class _113CustomQueue {
    public static void main(String[] args) {
        _113CustomQueue g=new _113CustomQueue(5);
        g.insert(45);
        g.insert(45);
        g.insert(780);
        g.insert(795);
        g.insert(12);
        try{
            g.remove();
            g.remove();

                    
        }catch(Exception e){
            System.out.println("");
        }
//        g.printing();
      try{
          System.out.println(  g.front());
      }catch(Exception e){
          
      }
                
    }
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public _113CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public _113CustomQueue(int size){
        this.data =new int[size];
        
    }
        public boolean isFull() {
        return end == data.length ;//means we are at last index
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
public int remove()throws Exception{
    if(isEmpty()){
        throw new Exception ("Queue is Empty can't remove anything");
        
    }
    int removed=data[0];
    for(int i=1;i<end;i++){
        data[i-1]=data[i];
        
    }
    end--;
    return removed;
}
public int front() throws Exception{
    if(isEmpty()){
        throw new Exception ("Queue is empty");
        
    }
    return data[0];
}
public void printing(){
    for(int i=0;i<end;i++){
        System.out.print(data[i]+" -->");
    }
    System.out.println("END");
}
}
