package Cybersoft.javacore;

import java.util.Scanner;

public class Bai13 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i+1);
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        average(arr);
        System.out.println();
        System.out.println("Tìm Max & Min: ");
        min(arr);
        max(arr);
        System.out.println();
        System.out.println("Tìm Max âm & Min âm: ");
        ammax(arr);
        ammin(arr);
        System.out.println();
        System.out.println("Tìm chẳn lẻ: ");
        chan(arr);
        System.out.println();
        le(arr);
        System.out.println();
        System.out.println();
        System.out.println("Thêm phần thử vào mảng");
        System.out.print("  Nhập số cần thêm: ");
        int index = scanner.nextInt();
        arr = insert(arr,index);
        xuat(arr);
        System.out.println();
        System.out.println();
        System.out.println("Xoá phần tử khỏi mảng");
        delete(arr);
    }
 
    public static void xuat(int[] arr) {
    	System.out.printf("  Các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void average(int[] arr)
    {
    	double sum = 0, tb = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        tb = sum / arr.length;
        System.out.printf("Giá trị trung bình: %s\n", tb);
    }
    public static void max(int[] arr)
    {
    	int max = arr[0];
    	for(int i = 0; i < arr.length ; i++)
    	{
    		if(max < arr[i])
    		{
    			max = arr[i];
    		}
    	}
    	System.out.printf("  Max: %s\n", max);
    }
    public static void min(int[] arr)
    {
    	int min = arr[0];
    	for(int i = 0; i < arr.length ; i++)
    	{
    		if(min > arr[i])
    		{
    			min = arr[i];
    		}
    	}
    	System.out.printf("  Min: %s \n", min);
    }
    public static void ammax(int[] arr)
    {
    	int temp = 0;
    	for (int i = 0; i<arr.length; i++)
    	{
    		if(arr[i] < 0)
    		{
    			temp = arr[i];
    		}
    		for (int j = 0; j < arr.length; j++)
    		{
    			if(arr[j] > temp && arr[j] < 0)
    			{
    				temp = arr[j];
    			}
    		}
    	}
    	System.out.printf("  Nguyên âm lớn nhất: %s\n", temp);
    }
    public static void ammin(int[] arr)
    {
    	int temp = 0;
    	for (int i = 0; i<arr.length; i++)
    	{
    		if(arr[i] > 0)
    		{
    			temp = arr[i];
    		}
    		for (int j = 0; j < arr.length; j++)
    		{
    			if(arr[j] < temp && arr[j] < 0)
    			{
    				temp = arr[j];
    			}
    		}
    	}
    	System.out.printf("  Nguyên âm nhỏ nhất: %s\n", temp);
    }
    public static void le(int[] arr)
    {
    	System.out.print("  Các phần tử lẻ: ");
    	for (int i = 0; i < arr.length; i++)
    	{
    		if (arr[i] % 2 !=0)
    		{
    			System.out.print(arr[i] + "  ");
    		}
    	}
    }
    public static void chan(int[] arr)
    {
    	System.out.print("  Các phần tử chẳn: ");
    	for (int i = 0; i < arr.length; i++)
    	{
    		if (arr[i] % 2 ==0)
    		{
    			System.out.print(arr[i] + "  ");
    		}
    	}
    }
    public static int[] insert( int[] arr, int index)
    {
    	int i;
    	int arrindex = arr.length - 1;
    	int tempindex = arr.length;
    	int[] temparr = new int [tempindex +1];
    	boolean ins = false;
    	
    	for(i = tempindex; i >= 0; i--)
    	{
    		if(arrindex > -1 && arr[arrindex] > index)
    		{
    			temparr[i] = arr[arrindex--];
    		} else {
    			if(!ins)
    			{
    				temparr[i] = index;
    				ins = true;
    			} else {
    				temparr[i] = arr[arrindex--];
    			}
    		}
    	}
    	return temparr;
    }
    public static void delete( int[] arr)
    {
    	int index, i ,c;
    	System.out.print("  Nhập số cần xoá: ");
    	index = scanner.nextInt();
    	for(c = i = 0; i < arr.length; i++)
    	{
    		if(arr[i] != index) {
    			arr[c] = arr[i];
    			c++;
    		}
    	}
    	System.out.printf("  Mảng sau khi xoá "+  index + " là: ");
        for (i = 0; i < c; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
