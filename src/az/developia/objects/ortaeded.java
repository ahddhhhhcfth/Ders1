package az.developia.objects;

public class ortaeded {

	public static void main(String[] args) {
		int eded=345;
		int say=0;
		int cem=0;
		while(eded>0) {
			int qaliq=eded%10;
			cem+=qaliq;
			eded/=10;
		}
System.out.println("cem "+ cem);
System.out.println("averge "+ cem/say);
	}

}