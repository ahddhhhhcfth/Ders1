package az.developia.objects;

import java.util.Iterator;

public class massiv {

	public static void main(String[] args) {
		int a=3;
		int b=6;
		int c=7;
		
		int[] herif=new int[7];
		herif[0]=65;
		herif[1]=67;
		herif[2]=63;
		herif[3]=62;
		herif[4]=64;
		herif[5]=66;
		herif[6]=6;
		int cem=0;
		
		for (int i = 1; i < 7; i++) {
			
			System.out.println(herif[i]);
			cem +=herif[i]; 
		}
		
		System.out.println(cem);
		
		
		
				
		
		

	}

}
