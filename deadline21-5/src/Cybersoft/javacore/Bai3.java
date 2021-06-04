package Cybersoft.javacore;

public class Bai3 {
	public static void main(String[] args) {
		System.out.print("Java version: ");
		System.out.println(System.getProperty("java.version"));
		System.out.print("Java Runtime Version: "); 
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.print("Java Home: ");
		System.out.println(System.getProperty("java.home"));
		System.out.print("Java Vendor: ");
		System.out.println(System.getProperty("java.vendor"));
		System.out.print("Java Vedor URL: ");
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.print("Java Class Path: ");
		System.out.println(System.getProperty("java.class.path"));
	}
}
