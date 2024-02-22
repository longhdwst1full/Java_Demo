package lab;

public class interface_lab {
	public interface MyInter1 {

		void meth1();

		void meth2();

	}

	public interface MyInter2 {

		void meth3();

	}

	public class MyClass implements MyInter1, MyInter2 {

		public void meth1() {
			System.out.println("Implements method 1");
		}

		public void meth2() {
			System.out.println("Implements method 2");
		}

		public void meth3() {
			System.out.println("Implements method 3");
		}

	}
}
