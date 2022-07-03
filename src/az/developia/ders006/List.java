package az.developia.ders006;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList <String> ( );
		names.add("Anar");
		names.add("Misa");
		names.add("Sahin");
		names.add("Ferid");
		names.add("Pervin");
System.out.println(names);
  Collection.sort(names);
 System.out.println(names);

 
 ArrayList <Integer> n = new ArrayList<> ( );
	n.add(4);
	n.add(7);
	n.add(8);
	n.add(6);
	n.add(5);
	System.out.println(n);
	Collection.sort(n);
	System.out.println(n);
	
	
	
	
	
	
	}

	}


