package com.scg.listdemo;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		 Vector<Integer> v = new Vector <Integer>();  
	        v.add(100);  
	        v.add(200);  
	        v.add(300);  
	        v.add(200);  
	        v.add(400);  
	        v.add(500);  
	        v.add(600);  
	        v.add(700); 
	        v.add(200);  
	        v.add(300);  
	        v.add(200);  
	        v.add(400);  
	        v.add(500);  
	        v.add(600);  
	        v.add(700); 
	        System.out.println("Values in vector: " +v); 
	         
	        System.out.println("Remove first occourence of element 200: "+v.remove((Integer)200)); 
	        
	        System.out.println("Values in vector: " +v);  
	        
	        System.out.println("Remove element at index 4: " +v.remove(4));
	        
	        System.out.println("New Value list in vector: " +v);  
	        
	        v.removeElementAt(5);        
	    
	        System.out.println("Vector element after removal: " +v);  
	         
	        System.out.println("Element at index 1 is = "+v.get(1));
	        
	        System.out.println("capacity : "+v.capacity());
	        
	        System.out.println("size : "+v.size());
	        
	        
	        System.out.println(v);
	        
	}

}
