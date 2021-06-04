package Cybersoft.javacore;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, temp = 0, temp1 = 0;
		do {
			System.out.print("Nhập số thứ nhất: ");
			a = Integer.parseInt(sc.nextLine());
		}while(a < 10 || a > 99);
		
		do {
			System.out.print("Nhập số thứ 2: ");
			b = Integer.parseInt(sc.nextLine());
		}while(b < 10 || b > 99);
		for (int i = 1 ; i < a && i< b ; i++)
		{
			temp = a % 10;
			a = a/ 10;
			temp1 = b % 10;
			b = b/ 10;
			if(temp == temp1)
			{ 
				System.out.println("True");
			}
			else System.out.println("False");
		}
	}
}
