package Cybersoft.javacore;

import java.util.Scanner;

public class Bai14 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i+1);
            arr[i] = sc.nextInt();
        }
        xuat(arr);
	}
	
	public static void xuat(int[] arr)
	{
		int[] arrtemp = new int[100];
		boolean found;
		int count = 0;
		arrtemp[0] = arr[0];
		count++;
		for(int i = 1; i < arr.length; i++)
		{
			found = false;
			for(int j = 0; j < count; j++)
			{
				if(arrtemp[j] == arr[i])
				{
					found = true;
					break;
				}
			}
			if (!found)
			{
				arrtemp[count] = arr[i];
				count++;
			}
		}
		arr = new int[count];
		for(int i = 0;i < arr.length; i++)
		{
			arr[i] = arrtemp[i];
		}
		System.out.print("Mảng sau khi xoá phần tử trùng: ");
		for(int i : arr)
		{
			System.out.print(i+"  ");
		}
	}
}
