package chapter1;

public class StudentTest {

	
	int sum(int a, int b) {
		
		return a+b;
	}
	
	
	public static void main(String[] args) {
		Students st1= new Students();
		 
		 
		Students st2 = new Students("long test", 26);
		System.out.println("check obj: " + st2.getName() + " and age = " + st2.getAge());
	}}
