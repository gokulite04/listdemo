package com.scg.listdemo;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(20);
        l1.add(21);
        l1.add(22);
        l1.add(23);
        
        System.out.println("ArrayList is :"+l1);
        
        l1.set(2,50);
        
        System.out.println("replace 2nd index  element with 50:" +l1);
        
        l1.add(1,49);
        
        System.out.println("inserted  49 at index 1:"+l1);
        
        l1.remove(1);
        
        System.out.println("removed element from index 1:"+l1);
        
        System.out.println("size of ArrayList l1 is:"+l1.size());
        
        System.out.println("printing element one by one :");
        
        for(int i=0;i<l1.size();i++)
        	System.out.println(l1.get(i));
        
        
	    List <Integer> l2 = new ArrayList<Integer>();
        l2.addAll(l1);
        System.out.println("list l2 is :"+l2);
  
    }
}
