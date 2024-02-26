package ke_thua;

public class Animal {
	void eat() {
		System.out.println("Animal is eating....");
	}

}

class Dog extends Animal {
//	void eat() {
//		System.out.println("dog is eating...");
//	}
}

class BabyDog1 extends Dog {
	void eat() {
		System.out.println("BabyDog1 is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("cat is eating...");
	}
}

 
