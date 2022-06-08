package dersOnPrktika;

public class camputeradi {

	 
		private int ramSize;
		private int discSize;
		private String brand;
		public int getRamSize() {
			return ramSize;
		}
public  camputeradi(int r,int d, String b) {
	ramSize=r;
	discSize=d;
	brand=b;
}
void print() {
	System.out.println("ramSize : "+ramSize);
	System.out.println("discSize : "+discSize);
	System.out.println("brand : "+brand);
	System.out.println("-----------------");
}
	}


