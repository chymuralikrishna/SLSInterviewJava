package com.sls.interview;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {
public static void main(String[] args) {
//Iterable<T>
//	Collection<E>
//	List<E>
	System.out.println("List Interface");
//	collection of ordered elements
//	List implements ArrayList,Vector,Stack,LinkedList
//	ArrayList
//	Auto size increase/decrease
//	can not be used for primitive types.(wrapper classes can be used instead)
	System.out.println("ArrayList");
	
	  ArrayList<Integer> alStr=new ArrayList<Integer>(); List<Integer>lStr=new
	  ArrayList<Integer>(); for(int i=0;i<10;i++) { lStr.add(i); } for(int
	  i=0;i<10;i=i+2) { alStr.add(i); }
	  
	  
	  lStr.forEach((n)->{System.out.println(n.hashCode());});
	  
	  lStr.remove(9); System.out.println("After remove index 9");
	  lStr.forEach((n)->{System.out.println(n);}); lStr.retainAll(alStr);
	  System.out.println("After retainAll(alStr)"); // since 1.8
	  lStr.forEach((n)->{System.out.println(n);});
	  
	  List<Object> lo=new ArrayList<Object>(); lo.add(""); lo.add(1); lo.add(2);
	  lo.add(true); lo.add('c'); lo.add('d'); lo.add('e');
	  lo.forEach((n)->System.out.println(n.hashCode()));
	  // List is non-synchronized
	  List<Object> nonSyncList=new ArrayList<Object>();
	  nonSyncList.add("originalObj1");
	  nonSyncList.add("originalObj2");
	  nonSyncList.forEach((n)->System.out.println(n));
	  Object obj=nonSyncList.get(0);
	  obj="modifiedObj1";
	  nonSyncList.set(0, obj);
	  nonSyncList.forEach((n)->System.out.println(n));
//	LinkedList
//	  implemented linked list DS
//	  Elements(nodes) not stored in contiguous locations 
//	  Every element is separate object with data & address part
//	  Elements(Nodes) are linked using pointers
	System.out.println("linkedList");
	LinkedList<Object> ll=new LinkedList<Object>();
	ll.add(1);
	ll.add(3);
	ll.add(7);
	ll.add(null);
//	ll.forEach((n)->System.out.println(n.hashCode()));
	System.out.println(ll);
	
	
//	Vectors
//	similar to the arraylist
//	synchronized
	System.out.println("Vectors");
	 // vector is synchronized
	  Vector<Object> syncVector=new Vector<Object>();
	  syncVector.add("originalObj1");
	  syncVector.add("originalObj2");
	  syncVector.add(null);
	  syncVector.add(null);
	  syncVector.forEach((n)->System.out.println(n));
	  Object objVet=syncVector.get(0);
	  objVet="modifiedObj1";
	  syncVector.set(0, objVet);
	  syncVector.forEach((n)->System.out.println(n));
	
//	Stack
	  System.out.println("Stack");
//	  Implemented Stack DS
//	  LIFO
//	  push,po,empty,peek,search
//	  subclass of vector
	  Stack<String> s=new Stack<String>();
	  s.push("string1");
	  s.push("string2");
	  s.push("string3"); 
	  s.forEach((n)->System.out.println(n));
	 System.out.println(s.peek());
	 s.pop();
	 System.out.println(s.search("string2"));
	 s.forEach((n)->System.out.println(n));
//	 Queue
//	 Queue FIFO
//	 Queue implements one class PriorityQueue
	System.out.println("Queue Interface");
//	Priority Queue
//	add(),peek(),poll()
	 System.out.println("PriorityQueue----->Queue");
	 PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	 pq.add(10);
	 pq.add(15);
	 pq.add(30);
	 pq.add(20);
	 pq.add(5);
	 System.out.println(pq);
//	 System.out.println("Peek"+pq.peek());
	System.out.println("Poll"+pq.poll());
	System.out.println(pq);
//	Dequeue
	System.out.println("Dequeue interface");
//	ArrayDequeue
//	Bidirectional traverse 
//	add(),addFirst(),addLast()
	System.out.println("ArrayDequeue---->Dequeue");
	Deque<Integer> adq=new ArrayDeque<Integer>();
	adq.add(10);
	adq.add(20);
	adq.add(15);
	adq.add(25);
	adq.add(35);
	adq.add(30);
	System.out.println(adq);
	adq.addFirst(5);
	adq.addLast(35);
	adq.addLast(55);
	System.out.println(adq);
	adq.spliterator();
	Spliterator sp1=adq.spliterator();// since 1.8
	Spliterator sp2=sp1.trySplit();
	sp1.forEachRemaining((n)->System.out.println(n)); 
	System.out.println("Spliter");
	sp2.forEachRemaining((n)->System.out.println(n));
		
//	Set
	System.out.println("Set interface");
//	Collection of unordered elements
//	Does not allow duplicates
//	does allow more than one  NULL elements
	
//	Set implements  HastSet, LinkedHashSet,TreeSet
//	HashSet
//	no duplicates
//	store based on hashCode value
	System.out.println("Hastset---->Set");
	Set<String> hs=new HashSet<String>();
	hs.add("Nuclear");
	hs.add("Fuel");
	hs.add("Complex");
	hs.add("Hyderabad");
	hs.add("Hyderabad");// No duplicate
	hs.add("Hyderabad");
	hs.add(null);
	hs.forEach((n)->System.out.println(n));
	/* Result // storing values based on hashCode
	 * Nuclear Fuel Hyderabad Complex
	 */
//	LinkedhashSet
	System.out.println("LinkedHashSet<T>------->Set<T>");
//	Same as HashSet, but uses Double linked list DS for storing elements in order

	Set<String> lhs=new LinkedHashSet<String>();
	lhs.add("Nuclear");
	lhs.add("Fuel");
	lhs.add("Complex");
	lhs.add("Hyderabad");
	lhs.add("Hyderabad");// No duplicate
	lhs.add("Hyderabad");
	lhs.add(null); 
	lhs.forEach((n)->System.out.println(n));
	
	
//	TreeSet
//	stores data in sorted 
	System.out.println("TreeSet<T>--->Set<T>");
	TreeSet<String> ss=new TreeSet<String>();
	ss.add("Nuclear");
	ss.add("Fuel");
	ss.add("Complex");
	ss.add("Hyderabad");
	ss.add("Hyderabad");// No duplicate
	ss.add("Hyderabad");
//	ss.add(null); //TreeMap does not allow null values
	ss.forEach((n)->System.out.println(n));
	System.out.println(ss);
//	Map interface
	
	System.out.println("MAP Interface");
	System.out.println("HashMap");
	Map<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"Nuclear");
	hm.put(7,"Fuel");
	hm.put(3,"Complex");
	hm.put(8,"Hyderabad");
	hm.put(2,"Hyderabad");// No duplicate
	hm.put(6,"Hyderabad");
	hm.put(null,"Hyderabad");
	hm.put(null,"Hyderabad");
	System.out.println(hm);
	System.out.println("TreeMap");
	Map<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(1,"Nuclear");
	tm.put(7,"Fuel");
	tm.put(3,"Complex");
	tm.put(8,"Hyderabad");
	tm.put(2,"Hyderabad");// No duplicate
	tm.put(6,"Hyderabad");
//	tm.put(null,"Hyderabad"); // TreeMap does not allow null
	System.out.println(tm);
}
}
