package az.developia.objects;

public class enboyuk {

	public static void main(String[] args) {
		int rqemim=5486;
		int boyuyecek=0;
		while(rqemim>0) {
			int qaliqim=rqemim%10;
			if(qaliqim>boyuyecek) {
				rqemim=rqemim/10;
			}
		}

System.out.println(boyuyecek);
	}
	
}
