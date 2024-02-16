package demo_java;

import java.util.Arrays;
import java.util.Scanner;

public class Hellowolrd {
	public static void main(String[] args) {
		System.out.println("Hello world");

		try (Scanner scanner = new Scanner(System.in)) {
			String name = scanner.nextLine();
			System.out.println("Your name is: " + name);
		} catch (Exception e) {
			// Handle any exceptions that might occur during input
			e.printStackTrace();
		}
		char myGrade = 'B';
		System.out.println(myGrade);

		int[] a = { 10, 4, 53, 23, 67, 55, 34 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.print("a= " + Arrays.toString(a));
	}
}
