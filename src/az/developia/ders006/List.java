package az.developia.ders006;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		ArrayList <String> name =ArrayList <String> ( );
		names.add("Anar");
		names.add("Misa");
		names.add("Sahin");
		names.add("Ferid");
		names.add("Pervin");
System.out.println(names);

ListIterator<String> i= names.Listiterator();

while(i.hasNext()) {
	if(i.next().equals("Pervin")) {
		i.remove();
	}
}
	}

}
