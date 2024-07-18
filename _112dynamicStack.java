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
public class _112dynamicStack extends _111customStack{
    public _112dynamicStack(){
        super();
    }
    public _112dynamicStack(int size){
        super(size);
    }
    @Override
        public boolean push(int item) {
            if(this.isFull()){
                int []temp=new int[data.length*20];
                // copy
                for(int i=0;i<data.length;i++){
                    temp[i]=data[i];
                    
                }
                data=temp;
            }
            return super.push(item);
        }
}
