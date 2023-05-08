import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.HashMap");
		//HashMap is the implementation of Map, but it doesn't maintain any order.
      HashMap<Integer,String> hm = new HashMap<Integer,String>();
      hm.put(567, "arunkarthick");// maintain uniquekey
      hm.put(587, "arunkarthick");
      hm.put(597, "arunkarthick");
      System.out.println(hm); // normal method to print 
      //iterator method
      for(Map.Entry m : hm.entrySet()) {
    	  System.out.println("The key is "+m.getKey());
    	  System.out.println("The value is "+m.getValue());
    	  
    	  // LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
    	  System.out.println("\n2.Linkedhashmap");
    	  
    	  LinkedHashMap <Integer,String> lm = new  LinkedHashMap<Integer,String>();
          hm.put(567, "arun");// maintain uniquekey
          hm.put(587, "arunkarthick2");
          hm.put(597, "arunkarthick3");
          System.out.println(hm);
          
          System.out.println("\n3.TreeMap");
          //TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(100,"Amit");    
          map.put(102,"Ravi");    
          map.put(101,"Vijay");    
          map.put(103,"Rahul");    
            
          for(Map.Entry tm:map.entrySet()){    
           System.out.println(tm.getKey()+" "+tm.getValue());    
      }
      }
	}
}
/*
Output
1.HashMap
{597=arunkarthick, 567=arunkarthick, 587=arunkarthick}
The key is 597
The value is arunkarthick

2.Linkedhashmap
{597=arunkarthick3, 567=arun, 587=arunkarthick2}

3.TreeMap
100 Amit
101 Vijay
102 Ravi
103 Rahul
The key is 567
The value is arun

2.Linkedhashmap
{597=arunkarthick3, 567=arun, 587=arunkarthick2}

3.TreeMap
100 Amit
101 Vijay
102 Ravi
103 Rahul
The key is 587
The value is arunkarthick2

2.Linkedhashmap
{597=arunkarthick3, 567=arun, 587=arunkarthick2}

3.TreeMap
100 Amit
101 Vijay
102 Ravi
103 Rahul
*/

