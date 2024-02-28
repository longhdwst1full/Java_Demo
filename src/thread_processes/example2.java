package thread_processes;

import java.util.Scanner;

public class example2 {
	public static int nhapMasv() {

		int result;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập mã sv: ");
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Mã số sv không hợp lệ. nhập vào số nguyên");
				scanner.next();
				// TODO: handle exception
			}
		}
		scanner.close();
		return result;
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int masv = nhapMasv();

			Sinhvien sv = new Sinhvien(masv, " long", 6.9, 25);
			System.out.println("sinh viên info:  " + sv);

		}
		;
	}
}
