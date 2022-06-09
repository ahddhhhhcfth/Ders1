package dersOnPrktika;

public class Arrayprinte {
 public void print( camputeradi[]camputers) {
	 for (int i = 0; i < camputers.length; i++) {
		camputers[i].print();
		
	}
 }
 public void sort(camputeradi[] camputers,String sortType) {
	 boolean swapOccured=true;
	 while(swapOccured) {
		  
	 }
	 if(camputers[0].getRamSize()>camputers[1].getRamSize()) {
		 camputeradi temp=camputers[0];
		 camputers[0]=camputers[1];
		 camputers[1]=temp;
		 
		 
	 }
 }
}
