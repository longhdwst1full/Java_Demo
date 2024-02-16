package chapter1;

public class Students {

//	class attributes
	private String name;
	private int age;
	private String address;
	
	
	
	public Students() {
		
	}
	
	public Students(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { // setter
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
