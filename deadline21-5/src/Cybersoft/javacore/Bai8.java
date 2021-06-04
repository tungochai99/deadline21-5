package Cybersoft.javacore;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String chuoi = scanner.nextLine();
		char[] arr = chuoi.toCharArray();
		boolean space = true;
		for(int i = 0; i < arr.length; i++)
		{
			if(Character.isLetter(arr[i]))
			{
				if(space)
				{
					arr[i] = Character.toUpperCase(arr[i]);
					space = false;
				}
			}
			else space = true;
		}
		chuoi = String.valueOf(arr);
		System.out.println("Chuỗi in hoa: " + chuoi);
	}
}
