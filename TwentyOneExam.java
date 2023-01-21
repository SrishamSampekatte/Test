1)                                              Iterable (Interface)
                                                       |
													   |
													   |
												  Collection(Interface)
													   |
													   |
						
						
						
						List(Interface)              Quee(Interface)               Set
						                                                                LinkedHasSet
																						HasSet
						      ArreyList                      Dquee                  |
							  LinkedList                                                     (SortedSet)(Interface)

	* Java Collection hierarchy in java is a framework provides the Structural design which is used to store and control the group of objects .
	* It consists of group of interfaces and classes.
	*The Java collection hierarchy accomplished with the entire operations performed on data like insertion, deletion, searching, sorting and manipulation. The Java Collection depicts the single unit of objects.
    *Parent most interface is Iterable, and Collection is also a interface extended by Iterable.
    *It makes available with a number of interfaces like Set, Queue, Deque, List and also it available with the classes like ArrayList, LinkedList,LinkedHashSet, HashSet.
	
3) HashSet :-
     1)HashSet which stores its elements in a hash table, is the best-performing implementation. 
	 2)HashSet allows only unique elements. 
	 3)It doesn’t maintain the insertion order which means element inserted last can appear at first when traversing the HashSet.
	 
	TreeSet:-
	 1)HashSet which stores its elements in a hash table, is the best-performing implementation. 
	 2)HashSet allows only unique elements. 
	 3)It doesn’t maintain the insertion order which means element inserted last can appear at first when traversing the HashSet.

4) hashCode() method: hashCode() method is used to get the hash code of an object. hashCode().
   method of the object class returns the memory reference of an object in integer form. 
   Definition of hashCode() method is public native hashCode().
   It indicates the implementation of hashCode() is native because there is not any direct method in java to fetch the reference of the object. 
   It is possible to provide your implementation of hashCode().
    In HashMap, hashCode() is used to calculate the bucket and therefore calculate the index.

equals() method: This method is used to check whether 2 objects are equal or not. This method is provided by the Object class. You can override this in your class to provide your implementation.
HashMap uses equals() to compare the key to whether they are equal or not. If the equals() method return true, they are equal otherwise not equal. 
	 
5)  Fail Fast Iterator:
      1)The iterator in Java is used to traverse over a collection's objects.
      2)The collections return two types of iterators, either it will be Fail Fast or Fail Safe.
      3)The Fail Fast iterators immediately throw ConcurrentModificationException in case of structural modification of the collection. 
	  4)Structural modification means adding, removing, updating the value of an element in a data collection.
	FailSafe Iterator :-
       1)We can perform the modification operations on a collection while iterating over it.
       2)They will not throw ConcurrentModificationException during the iteration.
       3)The Fail Safe iterators use a copy of the collection to traverse over the elements.
       4)Unlike the Fail Fast, they require more memory as they cloned the collection.
       5)The examples of Fail Safe iterators are ConcurrentHashMap, CopyOnWriteArrayList, etc.	
	   
	   
	   
6)Steps to convert String to Stream of Chars :-  
       1)Get the String.
       2)Create a List of Characters.
       3)Convert to String to IntStream using chars() method.
       4)Convert IntStream to Stream using mapToObj() method.
       5)Collect the elements as a List Of Characters using collect()
       6)Return the List.
	   

	   
7) Spliterator is a Java Iterator, which is used to iterate elements one-by-one from a List implemented object. Some important points about Java Spliterator are:
  1)Java Spliterator is an interface in Java Collection API.
  2)Spliterator is introduced in Java 8 release in java.util package.
  3)It supports Parallel Programming functionality.
  4)We can use it for both Collection API and Stream API classes.
  5)It provides characteristics about Collection or API objects.
  6)We can NOT use this Iterator for Map implemented classes.
	   
9]Core (spring-core) is the core of the framework that power features such as Inversion of Control and dependency injection. 
Beans (spring-beans) provides Beanfactory,which is a sophisticated implementation of the factory pattern.

10]
Dependency Injection in Java is a way to achieve Inversion of control (IoC) in our application by moving objects 
binding from compile time to runtime.
We can achieve IoC through Factory Pattern,Template Method Design Pattern, Strategy Pattern and 
Service Locator pattern.

11) In Spring Boot, we can use Spring Framework to define our beans and their dependency injection.
     The @ComponentScan annotation is used to find beans and the corresponding injected with @Autowired annotation.
If you followed the Spring Boot typical layout, no need to specify any arguments for @ComponentScan annotation.

12. No, By @Configuration annotation.


 13)        No.	StringBuffer	                                                   StringBuilder

 1)	StringBuffer is synchronized i.e. thread safe.                   It means two threads can't call the methods of StringBuffer simultaneously.	StringBuilder is non-synchronized i.e. not thread safe.              It means two threads can call the methods of StringBuilder simultaneously.
2)	StringBuffer is less efficient than StringBuilder.	             StringBuilder is more efficient than StringBuffer.
3)	StringBuffer was introduced in Java 1.0                                 	StringBuilder was introduced in Java 1.5


16)

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("India", 91);
		map.put("Hindusthan", 32);
		map.put("Srilanka", 13);
		map.put("Australia", 42);
		map.put("Dubai", 52);
		
		Set<Entry<String, Integer>> entry= map.entrySet();
		entry.forEach(ele->System.out.println(ele));
		
		map.forEach((key,value)->{if(value==52) {System.out.println(key);}});
			
		Iterator<Entry<String, Integer>> itr=entry.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent= itr.next();
			if(ent.getValue()==42) {
				itr.remove();
				for (Entry<String, Integer> entry2 : entry) {
					System.out.println(entry2);
				}
			}
		}
		
		
	}
}

17)  what is the use of
   maven:- Maven is chiefly used for Java-based projects, helping to download dependencies,
   which refers to the libraries or JAR files. The tool helps get the right JAR files for each
   project as there may be different versions of separate packages
 
  Gradel:Gradle is a build automation tool known for its flexibility to build software. A build automation
  tool is used to automate the creation of applications. The building process includes compiling, linking,
  and packaging the code. The process becomes more consistent with the help of build automation tools.

  Tomcat:-Apache Tomcat server: Apache Tomcat is a web container. It allows the users to run Servlet
  and JAVA Server Pages that are based on the web-applications. It can be used as the HTTP server.
  The performance of the Tomcat server is not as good as the designated web server.

  Quarkus:-Quarkus allows developers to automatically generate Kubernetes resources including building
   and deploying container images without having to manually create YAML files.
 
  SonarQube:- SonarQube  is an open-source platform developed by SonarSource for continuous inspection
  of code quality to perform automatic reviews with static analysis of code to detect bugs and code smells
  on all programming languages.
 
  server:-A server stores, sends, and receives data. In essence, it "serves" something else and exists to
  provide services. A computer, software program, or even a storage device may act as a server,
  and it may provide one service or several.
  
