package Cybersoft.javacore;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		double sum = 0; int n;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.print("Nhập n: ");
		n = Integer.parseInt(sc.nextLine());
		}while(n<2);
		System.out.printf("Tổng số nguyên tố là: %d",  tong(n));
	
		
	}
	public static int snt(int n)
	{
		if(n<2) return 0;
		for (int i = 2; i<= n/2; i++)
		{
			if(n%i==0)
				return 0;
		}
		return 1;
	}
	
	public static int tong(int n)
	{
		int sum = 0;
		for (int  i = 1 ; i<=n;i++)
		{
			if(snt(i)==1)
				sum=sum+i;
		}
		return sum;
	}
}
