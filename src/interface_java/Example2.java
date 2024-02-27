package interface_java;

public class Example2 {
	public static void main(String[] args) {
		System.out.println(" run video 51");
		Students st1 = new Students("123", "long", 18, 3);
		System.out.println(st1);
		st1.setGrade();
		System.out.println(st1);

		Person p1 = new Person("123", "eric", 26);
		System.out.println(p1);
	}
}
