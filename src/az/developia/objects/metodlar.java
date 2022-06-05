package az.developia.objects;


class metodlar{
	int age;

	
		void printNewValue (int c,String name) {
		for (int i = 0; i < c; i++) {
			System.out.println(name);
		
		}
			
	
	}
     String name;
}

 class Null {
	public static void main(String[] args) {
		metodlar p1= new metodlar();
		p1.name="Anar";
		p1.printNewValue(3,"Anar");
		p1.printNewValue(5,"Abbasov");
	
	}
}