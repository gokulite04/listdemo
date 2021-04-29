package com.scg.listdemo;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
        LinkedList<String> ll = new LinkedList<String>();
        
  int a=10;
  int c=15;
  int e=20;
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
  
        System.out.println(ll);
        
        System.out.println(ll.get(2));
        
        System.out.println(ll.indexOf("E"));
         
        System.out.println("First element is : "+ll.getFirst());
        
        System.out.println("Last element is : "+ll.getLast());
        
        for ( String str : ll)
        	System.out.print(str+ " ");
        
        
        System.out.println();
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
  
        System.out.println(ll);
        
        
    }

	}

