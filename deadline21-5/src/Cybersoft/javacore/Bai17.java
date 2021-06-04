package Cybersoft.javacore;

import java.util.Random;
import java.util.Scanner;

public class Bai17 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Random rand = new Random();
		int rannum = rand.nextInt(1000)+1;
		System.out.println(rannum);
		while(true)
		{
			System.out.print("Nhập 1 số: ");
			int n = sc.nextInt();
			if(n == rannum)
			{
				System.out.println("Stop!");
				break;
				
			} else System.out.println("Bạn đang nhập 1 số lớn hơn hoặc nhỏ hơn số bí mật!");
		}
		
	}
}
