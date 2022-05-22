package az.developia.objects;

public class otra {

	public static void main(String[] args) {
		int reqem=698;
		int boyuk=0;
		while(reqem>0) {
			int qaliq=reqem%10;
			if(qaliq>boyuk) {
				reqem=reqem/10;
			}
		}
System.out.println("cem ");


	}

}
