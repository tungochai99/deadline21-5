package Cybersoft.javacore;

import java.util.Scanner;

public interface Bai20 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập số lượng mảng: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for(int i= 0; i < n; i++)
		{
			System.out.printf("a[%d] = ",i+1);
			arr[i] = sc.nextInt();
		}
		phanMang(arr,n);
	}
	
	public static void phanMang(int[] arr,int n)
	{
		int c = 0, l = 0;
		int[] chan = new int[n];
		int[] le = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				chan[c] = arr[i];
				c++;
			} else
			{
				le[l] = arr[i];
				l++;
			}
		}
		System.out.print("Các phần tử mảng chẵn: ");
		for (int i = 0; i< c; i++)
		{
			System.out.print(chan[i] + "  ");
		}
		System.out.println();
		System.out.print("Các phần tử mảng lẻ: ");
		for (int i = 0; i< l; i++)
		{
			System.out.print(le[i] + "  ");
		}
	}
}
