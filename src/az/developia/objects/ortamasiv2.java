package az.developia.objects;

public class ortamasiv2 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int[] nomre=new int[8];
		nomre[0]=5;
		nomre[1]=6;
		nomre[2]=7;
		nomre[3]=4;
		nomre[4]=3;
		nomre[5]=2;
		nomre[6]=1;
		nomre[7]=8;
		boolean zamenoldu=true;
		int saygac=1;
		while(zamenoldu) {
			zamenoldu=false;
			for (int i = 1; i < 8; i++) {
				if(nomre[i]>nomre[i/2]) {
					int c=nomre[i];
					nomre[i]=nomre[i/2];
					nomre[i/2]=c;
					zamenoldu=true; 

	}

			}
		}
	}
}
