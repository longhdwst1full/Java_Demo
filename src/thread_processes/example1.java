package thread_processes;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap x = ");
			try {
				int x = scanner.nextInt();
				try {
					System.out.println("ket qua  10/x= " + 10 / x);
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("run x= " + x);
				}
			} catch (Exception e) {
				// TODO: handle exception
				scanner.next();
				System.out.println(" run error ");
			} finally {
				System.out.println(" run finally");
				scanner.close();
				// TODO: handle finally clause
			}
		}

	}
}
