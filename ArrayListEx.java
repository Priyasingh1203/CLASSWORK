package collection;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		//ArrayList<Integer> list=new ArrayList<Integger>();
		//object using polymorphism
		List<Integer> list=new ArrayList<>();
		list.add(34);
		list.add(56);
		list.add(45);
		list.add(34);
		System.out.println(list);
		System.out.println(list.size());
		list.add(77);
		list.add(99);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		//using for loop
		System.out.println("array list using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		
		}
		//each loop
		for(Integer in:list)
		{
			System.out.println(in+" ");
		}
		//using while loop
		/*System.out.println("array list using for while loop");
		int c=0;
		while(c<list.size())
		{
			System.out.print(list.get(c)+" ");
			c++;
		} */
		//using while loop iterator
		/*System.out.println();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			
		}*/
		//sort arraylist in asc order
		Collections.sort(list);
		System.out.println("after sorting: ");
		System.out.println(list);
		
		//sort arraylist in desc order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("\n After sorting in desc order: ");
		System.out.println(list);
		list.add(2, 100);
		System.out.println(list);
		
		//copy all elements to another arraylist
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(list);
		System.out.println("\n copied list: " +list2);
		
	}

}
