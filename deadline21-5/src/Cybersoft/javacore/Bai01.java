package Cybersoft.javacore;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		int doc, ngang;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều ngang: ");
		ngang = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập chiều dài: ");
		doc = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1 ; i <= doc ; i++)
		{
			 for(int j = 1 ; j <= ngang ; j++)
			 {
				 if(i==1 || i==doc || j==1 || j==ngang)
				 {
	    				System.out.print(" ");
				 }
	    			else if(i<=(doc/2)+1 && j<=(ngang/2)+1)
	    				System.out.print(" * ");
	    			else
	    				System.out.print(" = ");
			 }
			 System.out.println();
		}
	}
}
