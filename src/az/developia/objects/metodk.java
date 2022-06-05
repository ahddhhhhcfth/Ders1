package az.developia.objects;

public class metodk {

	public static void main(String[] args) {
		int someArray[] = {15, 82, 53, 74,};
		int sum = 0;

		for (int j = 0; j < someArray.length; j++) {
			sum +=j ;
			sum = sum + someArray[j];
		}
		

	}

}
class Gauss {
    public static void main(String[] args) {
        int[] ia = new int[101];
        for (int i = 0; i < ia.length; i++) ia[i] = i;
        int sum = 0;
        for (int e : ia) sum += e;
        System.out.println(sum);
        
    }
}