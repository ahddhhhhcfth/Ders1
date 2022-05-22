package az.developia.objects;

public class ortaeded {

	public static void main(String[] args) {
		double uzunlug=20;
		int gun=0;
		double litr=0;
		while(uzunlug<3000) {
			uzunlug=uzunlug+2*litr;
			litr=litr*1.5;
			gun++;
			
		}
System.out.println(gun);

	}

}
