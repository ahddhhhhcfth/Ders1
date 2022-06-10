package cars;

public class mawina {
	private int id;
    private int speed;
    private String brand;

	public	mawina(int i, int s, String b) {
		id=i;
		speed=s;
		brand=b;
	}
	void print() {
		System.out.println("id : " + id);
		System.out.println("speed : " + speed);
		System.out.println("brand : " + brand);
	}
}
 