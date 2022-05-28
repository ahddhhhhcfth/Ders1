package az.developia.objects;

public class obyomniyzMassiv {

	public static void main(String[] args) {
		int[] a= new int[5];
		int[]  b=new int[6];
		
		int[][] c=new int[7][];
		c[0]=a;
		c[1]=b;
		
		System.out.println(c[2]);
		System.out.println(a[1]);
		

	}

}
