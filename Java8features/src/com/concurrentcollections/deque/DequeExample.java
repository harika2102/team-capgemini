package com.concurrentcollections.deque;
import java.util.ArrayDeque;
import java.util.Deque;
/*ArrayDeque class implements the Deque interface. 
 * It facilitates us to use the Deque. Unlike queue, 
 * we can add or delete the elements from both the ends.

ArrayDeque is faster than ArrayList and Stack 
and has no capacity restrictions.
 */
public class DequeExample{  
public static void main(String[] args) 
  {  
    //Creating Deque and adding elements  
    Deque<String> deque = new ArrayDeque<String>();  
                  deque.add("Raju");  
                  deque.add("Mohan");  
                  deque.add("Kiran");  
    //Traversing elements  
    for (String str : deque) {  
        System.out.println(str);  
    }  
   }  
  }  