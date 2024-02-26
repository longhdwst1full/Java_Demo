package ke_thua;

public class Sinh_vien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;
	 
	
	public Sinh_vien(String id, String name, double price, double tax) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}


	public  void  info() {
		System.out.println("run info from parent");
	}
}
