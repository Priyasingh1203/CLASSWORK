package collection;
import java.util.*;
public class Conversion {
 public static void main(String []args)
 {
	 ArrayList<String> list=new ArrayList<String>();
	 list.add("I");
	 list.add("AM");
	 list.add("PRIYA");
	 list.add("SINGH");
	 String array[]=new String[list.size()];
	 
	 for(int i=0;i<list.size();i++)
	 {
		 array[i]=list.get(i);
	 }
	 for(String l:array)
	 {
		 System.out.println(l);
	 }
 }
}
