package thread_processes;

public class Sinhvien {

	private int masv;
	private String hoten;
	private double diem;
	private int age;
	
	
// create contractor
	public Sinhvien(int masv, String hoten, double diem, int age) {
		
		this.age= age;
		this.masv= masv;
		this.diem= diem;
		this.hoten= hoten;
		
	}


	public int getMasv() {
		return masv;
	}


	public void setMasv(int masv) {
		this.masv = masv;
	}


	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	public double getDiem() {
		return diem;
	}


	public void setDiem(double diem) {
		this.diem = diem;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Sinhvien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
	}
	
//	create set get
	
	
	
}
