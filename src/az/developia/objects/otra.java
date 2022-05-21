package az.developia.objects;

public class otra {

	public static void main(String[] args) {
		int eded=686;
		int say=0;
		int cem=0;
		while(eded>0) {
			int qaliq=eded%10;
			cem+=qaliq;
			eded/=10;
			say++;
		}
System.out.println("cem "+cem);
System.out.println("average "+cem/say);

	}

}
