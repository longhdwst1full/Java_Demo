package ke_thua;

public class ShowResult {
	public static void main(String[] args) {
		System.out.println(" run video ");

		Sinh_vien it1 = new SinhvienIT("java", "3", "java22", 10, 7);
		System.out.println(" sinh vien it score = " + it1.name);
		System.out.println(" hello");
		Animal a = new Cat();
		Animal b = new BabyDog1();

		a.eat();
		b.eat();
	}
}
