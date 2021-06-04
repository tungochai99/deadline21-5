package Cybersoft.javacore;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int n = 0;
		int sonhiphan;
		double sothapphan;
		sonhiphan = Dec1Bin(n);
		System.out.printf("Số nhị phân vừa đổi: " + sonhiphan + "\n");
		sothapphan = Bin2Dec(n);
		System.out.printf("Số nhị phân vừa đổi: " + sothapphan );
	}
	
	public static int Dec1Bin (int n) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thập phân: ");
		n = Integer.parseInt(scanner.nextLine());
		int temp, sum=0, i =1 ;
		while(n>0)
		{
			temp=n%2;
	        sum=sum + (i*temp);
	        n=n/2;
	        i=i*10;
		}
		return sum;
	}
	public static double Bin2Dec(int n) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nhị phân: ");
		n = Integer.parseInt(scanner.nextLine());
		double temp = 0, i = 0;
		while(n>0)
		{
			temp = temp + (n % 10)*Math.pow(2, i);
			++i;
			n = n / 10;
		}
		return temp;
	}


}
