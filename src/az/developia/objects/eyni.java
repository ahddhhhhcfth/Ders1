package az.developia.objects;

public class eyni {

	public static void main(String[] args) {
	int reqem =568;
	int boyuk=0;
	while(reqem>0) {
		int qaliq=reqem%10;
		if(qaliq>boyuk) {
			qaliq=boyuk;
			
		}
		reqem=reqem/10;
	}
	System.out.println(boyuk);
	} 

}
