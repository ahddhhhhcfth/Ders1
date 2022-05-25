package az.developia.ders006;

public class ders6 {

	public static void main(String[] args) {
		String name="Anar";
		String surname="Abbasov";
		int age=23;
		int salary=30;
		
		person anar=new person();
		anar.name="anar";
		anar.surname="Abbasov";
		anar.age=23;
		anar.salary=30;
		anar.printMyAllInfo();
		anar.calculatorsalary(); 
		
		System.out.println(anar.age);
		System.out.println(anar.name);
		System.out.println(anar.surname);
		

	}
	
}
