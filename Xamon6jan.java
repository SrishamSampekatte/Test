   
   Srisham S M 
   
   
 1) Finding max and Min Values from array   
   
   
   package logics;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMin {
	public static void main(String args[]) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		arrList.add(45);
		arrList.add(333);
		arrList.add(76);
		arrList.add(29);
		arrList.add(900);
		arrList.add(23);
		arrList.add(474);
		arrList.add(654);
		arrList.add(29);
		arrList.add(454);

		int n = arrList.size();

		System.out.println("Elements in the List are  :");

		for (Integer integer : arrList) {
			int max = Collections.max(arrList);
			System.out.println("Maximum number in list  : " + max);

			int min = Collections.min(arrList);
			System.out.println("Minimum numer in list  : " + min);

		}

	}
}

2) public class Love {

	public static boolean flowersPetals(int flower1Petals, int flower2Petals) {
		return false;
		
	}
	
	    public static void main(String[] args) {

	        Scanner flower1 = new Scanner(System.in);
	        Scanner flower2 = new Scanner(System.in);

	        System.out.print("Enter a number of petals: ");
	        int num1 = flower1.nextInt();
	        int num2 = flower2.nextInt();
	        flowersPetals(num1,num2);
	        
	        if(num1%2==0 && num2%2==0) {
	        	System.out.println("They are not in love");
	        }else {
	        	System.out.println("They are in love");
	        }
	    }
	}


3) Generilzed Classes :-  is the process of common features from two or more classes, and combining them into a generalized super class. Common features can be methods, attributes and associations.

  Specilization :- Specialization is the reverse process of Generalization means creating new sub classes from an existing class.
  
4) a) By Declaring the class as final ,so we can avoid inheritence by other class .
   b) String the example for final calss defined in java ApI.
   c) Alternatives  to inheritence are : So far there is no alternative for inheritance  but we can achieve inheritance by using interface .
   
5)   I have used List,Array list ,tree set .

6)   Array list :
    a) ArrayList internally uses a dynamic array to store the elements.
	b) An ArrayList class can act as a list only because it implements List only.
	c)  ArrayList is better for storing and accessing data
	d)  The memory location for the elements of an ArrayList is contiguous.
	e)  ArrayList is a resizable array.
	
	LinkedList : -
	a) LinkedList internally uses a doubly linked list to store the elements.
	b) LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
	c)LinkedList is better for manipulating data.
	d) The location for the elements of a linked list is not contagious.
	e) it uses nodes .
	
7)  Iterator: 
     a)Iterators are used in the Collection to retrieve elements one by one. 
	 b)It is a universal iterator as we can apply it to any Collection object. 
	 c) By using Iterator, we can perform both read and remove operations.
	  Syntax : -
	          Iterator itr = c.iterator();
			  
			  it has 3 methods :-
			  hasNext(): ,Next(); and remove();
			  
    ListIterator: -
   a) ListIterator is an interface in Collection API. 
   b)It extends Iterator interface.
   c) To support Forward and Backward Direction iteration and CRUD operations, 
   d) We can use this Iterator for all List implemented classes like ArrayList, CopyOnWriteArrayList, LinkedList, Stack etc .	
   
   
10) Static polymorphism : -
      Static polymorphism is a type of polymorphism that collects the information to call a method during compile time.
	   and this is also called as cmethod overloading 
	  
	  Dynamic Polymorphism :- 
	  dynamic polymorphism is a type of polymorphism that collects information to call a method at run time. this is called as method over riding .
	  
11)  She can give security for her programs by making  properties as privite and providing access by setter and getter methos and this also called as encapsulatiom so she can give security for her programs. or she can use the property of the Oops called Abstract calss she can give security .


9) Memory leak is a situation when the garbage collector does not recognize the unused objects and they remain in the memory indefinitely that reduces the amount of memory allocated. Because of  the unused objects still being referenced that may lead to OutOfMemoryError. this is called memeory leakage . 





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	