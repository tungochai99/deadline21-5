package Cybersoft.javacore;

import java.util.Scanner;

public class Bai15 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập chuỗi: ");
		String chuoi = sc.nextLine();
		System.out.printf("Độ dài chuỗi là: %s\n", chuoi.length());
		System.out.print("Nhập vị trí cần lấy ký tự: ");
		int a =Integer.parseInt(sc.nextLine());
		System.out.println(chuoi.charAt(a-1));
	}
}
