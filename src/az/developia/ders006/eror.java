package az.developia.ders006;

public class eror {

	public static void main(String[] args) {
		int[] a = new int[2];
		System.out.println("salam");
		try {
			a[5]=5;
		}catch (ArrayIndexOutOfBoundsException kkkkkkk) {
			System.out.println(kkkkkkk);
		}
		System.out.println("bitdi"); 
		
	}

}
