package Cybersoft.javacore;

import java.util.Scanner;

public class Bai18 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		float nam;
		float lai = (float) 0.7;
		System.out.print("Nhập số tiền của anh X: ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số tiền anh X mong muốn: ");
		int wish = Integer.parseInt(sc.nextLine());
		
		nam = (float) ((Math.log(wish/money))/(Math.log(1+lai)));
		
		System.out.printf("Số năm anh X phải chờ đợi: %f", nam);
	}
}
