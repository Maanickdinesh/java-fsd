package collections;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. ArrayList");
       ArrayList<String> city = new ArrayList<String>();
       city.add("Chennai");
       city.add("Pune");
       city.add("Bangalore");
       System.out.println(city);
       System.out.println("2. Vector");
       Vector<Integer> zipcode = new  Vector<Integer>();
       zipcode.add(98766);
       zipcode.add(43435);
       zipcode.add(98865);
       System.out.println(zipcode);
       System.out.println("3.LinkedList ");
       LinkedList<String> al=new LinkedList<String>();  
       al.add("Ravi");  
       al.add("Vijay");  
       al.add("Ravi");  
       al.add("Ajay");  
       System.out.println(al);  // normal type
       Iterator<String> itr=al.iterator();  // iteration
       while(itr.hasNext()){  
        System.out.println(itr.next());  
       }  
       
       System.out.println("HashSet");
       HashSet<Integer> set=new HashSet<Integer>();  
       set.add(101);  
       set.add(103);  
       set.add(102);
       set.add(104);
       System.out.println(set);
       System.out.println("LinkedHashSet");
       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
       set2.add(11);  
       set2.add(13);  
       set2.add(12);
       set2.add(14);	       
       System.out.println(set2);


      
	}  
    
	

}
/*
Output
1. ArrayList
[Chennai, Pune, Bangalore]
2. Vector
[98766, 43435, 98865]
3.LinkedList 
[Ravi, Vijay, Ravi, Ajay]
Ravi
Vijay
Ravi
Ajay
HashSet
[101, 102, 103, 104]
LinkedHashSet
[11, 13, 12, 14]

 */

