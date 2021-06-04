package Cybersoft.javacore;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên: ");
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0, temp = 0;
		while(n>0) {
			temp = n%10;
			n = n /10;
			sum = sum + temp;
		}
		System.out.println("Tổng các số tự nhiên là: " + sum);
	}
	
}
