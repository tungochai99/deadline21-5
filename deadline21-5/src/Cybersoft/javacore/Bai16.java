package Cybersoft.javacore;

import java.util.Scanner;

public class Bai16 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean checkyear(int yy)
	{
		return (((yy % 4 == 0 ) && (yy % 100 != 0)) || (yy % 400 == 0));
	}
	public static void main(String[] args) {
		System.out.print("Nhập năm: ");
		int yy = Integer.parseInt(sc.nextLine());
		if(checkyear(yy) == true)
		{
			System.out.printf("%d là năm nhuận!", yy);
		} else System.out.printf("%d không phải là năm nhuận!", yy);
	}
}
