package com.scg.listdemo;
import java.util.*;
import java.util.List;

public class StackDemo {

	public static void main(String[] args) {
		
	   Stack <Integer> s = new Stack <Integer>();
	  
	   s.push(57);
	   s.push(58);
	   s.push(59);
	   s.push(60);
	   s.push(61);
       System.out.println("The stack s is : "+s);
       
       System.out.println("The pop operation on stack s : "+ s.pop());
       
       System.out.println("The peek on stack s :"+s.peek());
       
       System.out.println("stack is empty or not : "+s.empty());
       
       System.out.println("search element 59 :"+s.search(59));
       
	}

}
