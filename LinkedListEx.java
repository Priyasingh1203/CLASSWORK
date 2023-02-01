package collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListEx {

	public static void main(String[] args) {
		   LinkedList<String> ll= new LinkedList<String>();
		   ll.add("priya");
		   ll.add("Riya");
		   ll.add("iya");
		   ll.add("ya");
		 
		  
		   for(String str:ll)
		   {
			   System.out.println(str);
		   }
		   System.out.println("------------------------------------------------");
			Iterator itr=ll.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				
			}
            ll.addFirst("First");
            ll.addLast("Last");
            ll.add(2, "Singh");
            System.out.println(ll);
            ll.removeLast();
            ll.removeFirst();
            ll.remove(2);
            System.out.println(ll);
            ll.remove("priya");
            System.out.println(ll);
            
            ListIterator listitr=ll.listIterator();
            System.out.println("Forward Direction");
            while(listitr.hasNext())
            {
            	 System.out.println(listitr.next());
            }
            
            System.out.println("Backward Direction");
            while(listitr.hasPrevious())
            {
            	System.out.println(listitr.previous());
            }
            System.out.println("==============================================");
            Iterator it=ll.descendingIterator();
            while(it.hasNext())
            {
            	System.out.println(it.next());
            }
            if(ll.contains("Riya"))
            {
            	System.out.println("data present");
            }
            else
            	System.out.println("data not present");
            ll.push("bunny");
            System.out.println(ll);
            ll.pop();
            System.out.println(ll);
		}


}
