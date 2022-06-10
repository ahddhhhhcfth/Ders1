package cars;

public class ccars {

	public static void main(String[] args) {
	  mawina[] mawin=new mawina[5];
      mawin[0]= mawina (700,6,"BMW");
      mawin[1]= mawina (600,5,"Nissan");
      mawin[2]= mawina (500,4,"JeeP");
      mawin[3]= mawina (400,3,"KIA");
      mawin[4]= mawina (300,2,"Toyota");
      
      Arrayprinter printer=new Arrayprinter();
      printer.print(mawin); 
	}

}
