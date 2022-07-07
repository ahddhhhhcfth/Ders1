package az.developia.ders006;

import javax.management.RuntimeErrorException;

public class eror2 {

	public static void main(String[] args) {
		int []m= {3,5,7};
		int n=0;
		try {
			n=neyse (m,4);
		}catch(RuntimeException e) {
			System.out.println(e);
		}

	System.out.println(n);
	
	System.out.println("main bitdi");

}
static int neyse(int[]m, int i) {
	if(i> m.length) {
		throw new RuntimeException("seyfin var");
	}
	return m[i];
}
} 