package dersOnPrktika;

public class mainoractika {

	public static void main(String[] args) {
		 camputeradi [] camputers=new  camputeradi[4];
		 camputers[0]=new camputeradi (8,500,"HP");
		camputers[1]= new  camputeradi(24,250,"Acer");
		camputers[2] =new  camputeradi(12,750,"DEll");
		camputers[3] = new  camputeradi(16,120,"Toshiba");
		
		 Arrayprinte printer = new  Arrayprinte ();
		 printer.print(camputers);
		 
		 erreysort sorter=new erreysort();
		 sorter.sort(camputers);
		 printer.print(camputers);
		 
		 int[]array=new int[50];
		 mainoractika main=new mainoractika();
		 
		 for (int i = 0; i < array.length; i++) {
			array[i]= main.hashCode() ;
			System.out.println(array[i]+" ");
			
		}
		 int min=array[0];
		 for (int i = 0; i < array.length; i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		 System.out.println("Min is: " + min);
	}

}
