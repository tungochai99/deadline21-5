package Cybersoft.javacore;

import java.util.Scanner;

public class Bai19 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("==========MENU==========");
		System.out.println("1. Giải phương trình bậc 1!");
		System.out.println("2. Giải phương trình bậc 2!");
		System.out.println("0. Thoát!");
		float a = 0, b = 0 , c = 0;
		for(;;)
		{
		do
		{
			System.out.print("\nNhập: ");
			n = sc.nextInt();
			
		} while (n<0 || n>2);
		switch (n)
		{
		case 0:
			System.out.println("Close program!");
			System.exit(0);
			break;
		case 1: 
			ptbac1(a,b);
			break;
		case 2:
			ptbac2(a,b,c);
			break;
		}
		}
	}
	
	public static void ptbac1(float a, float b)
	{
		float kq = 0;
		System.out.println("              Phương trình bậc 1: ax + b = 0");
		System.out.print("Nhập a: ");
		a = sc.nextInt();
		System.out.print("Nhập b: ");
		b = sc.nextInt();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("Phương trình vô số nghiệm!");
			}
			else System.out.println("Phương trình vô nghiệm!");
		}
		else 
		{
			kq = -b/a;
			System.out.printf("Phương trình có nghiệm x= %s", kq);
		}
	}
	
	public static void ptbac2(float a, float b, float c)
	{
		float x1 = 0, x2 = 0;
		System.out.print("Nhập a: ");
		a = sc.nextInt();
		System.out.print("Nhập b: ");
		b = sc.nextInt();
		System.out.print("Nhập c: ");
		c = sc.nextInt();
		float delta = b*b - 4*a*c;
		if(delta < 0)
		{
			x1 = x2 = 0;
			System.out.println("Phương trình vô nghiệm!");
		}
		else if(delta == 0) {
			x1 = x2 = -b/(2*a);
			System.out.printf("Phương trình có nghiệm kép: x1 = x2 = %s", x1);
		}
		else {
			delta = (float) Math.sqrt(delta);
			x1 = (-b + delta) / (2*a);
			x2 = (-b - delta) / (2*a);
			System.out.printf("Phương trình có 2 nghiệm phân biệt: %f" + x1 + ",  %f" + x2);
		}
	}
}
