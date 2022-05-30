package az.developia.objects;

public class enboyukmassiv {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int[] nomre=new int[7];
		nomre[0]=5;
		nomre[1]=6;
		nomre[2]=7;
		nomre[3]=4;
		nomre[4]=3;
		nomre[5]=2;
		nomre[6]=1;
		boolean zamenoldu=true;
		int saygac=1;
		while(zamenoldu) {
			zamenoldu=false;
			for (int i = 1; i < 7; i++) {
				if(nomre[i]>nomre[i+1]) {
					int c=nomre[i];
					nomre[i]=nomre[i+1];
					nomre[i+1]=c;
					zamenoldu=true;
					
					
				}
				
			}
			saygac++;
		}
		

	}

}
