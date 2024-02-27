package interface_java;

public class Person implements IPerson {
	protected String id;
	protected String name;
	protected int age;
//   + viết constructor, setter, getter

	@Override
	public void input() {
		// TODO Auto-generated method stub

	}

	public Person(String id, String name, int age) {
		 
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void desplay() {
		// TODO Auto-generated method stub

	}

}
