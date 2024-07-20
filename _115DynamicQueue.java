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
public class _115DynamicQueue extends _114circularQueue{
    public static void main(String[] args) {
        
    }
    
     public _115DynamicQueue(){
super();    }
    public _115DynamicQueue(int size){
super(size);}
@Override
public boolean insert1(int item){
        if(this.isFull()){
            int[] temp=new int [data.length *2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front +i)%data.length];
                
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }
    }
  

