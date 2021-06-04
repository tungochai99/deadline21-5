package Cybersoft.javacore;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		double kc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập toạ độ A");
		System.out.print("Ax: ");
		int ax = Integer.parseInt(sc.nextLine());
		System.out.print("Ay: ");
		int ay = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập toạ độ B");
		System.out.print("Bx: ");
		int bx = Integer.parseInt(sc.nextLine());
		System.out.print("By: ");
		int by = Integer.parseInt(sc.nextLine());
		
		kc = Math.sqrt((bx-ax)*(bx-ax)+(by-ay*(by-ay)));
		System.out.println("Độ dài đoạn thẳng AB là: " + kc);
	}
}
