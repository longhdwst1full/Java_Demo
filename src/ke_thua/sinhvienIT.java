package ke_thua;

public class SinhvienIT extends Sinh_vien {


	private String language;
	public SinhvienIT(String language,String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.language= language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void info() {
		System.out.println(" run info from sinhvienIT");
	}

	public void getMoney() {
		System.out.println("run get money");
		super.info();
	}
}
