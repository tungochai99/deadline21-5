package Cybersoft.javacore;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
		System.out.print("Nhập n: ");
		n = Integer.parseInt(sc.nextLine());
		}while(n<1 || n>9);
		
		for (int i = 1; i <= n; i++)
		{
			for (int k = 1; k <= i; k++)
			{
				System.out.printf("%2d", k);
			}
			System.out.println();
		}
	}
}
