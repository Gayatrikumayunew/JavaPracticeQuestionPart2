/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.*;

/**
 *
 * @author gayatri
 */
public class _110StackQueue {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Queue <Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println( q.remove());
        
        // deque 
        Deque<Integer>d=new ArrayDeque();
        d.addFirst(5);
        d.addLast(56);
        System.out.println( d.removeFirst());
        System.out.println(  d.removeLast());
        
        
    }
}
