package com.firstmaven;
import java.util.*;
class Chocolate{
	public int presents(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count+=arr[i];
		}
		return count;
	}
}
class sweet extends Chocolate{
	public int presents(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count+=arr[i];
		}
		return count;
	}
}
public class Sweets{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of chocolates");
		int cn=sc.nextInt();
		System.out.println("Enter the chocolates");
		int s[]=new int[cn];
		for(int i=0;i<cn;i++) {
			s[i]=sc.nextInt();
		}
		System.out.println("Enter the no of sweets");
		int sn=sc.nextInt();
		System.out.println("Enter the sweets");
		int e[]=new int[sn];
		for(int i=0;i<sn;i++) {
			e[i]=sc.nextInt();
		}
		sweets sw=new sweets();
		Chocolates c=new Chocolates();
		System.out.println("The overall weight of chocolates received by the kid are:");
		System.out.println(c.presents(s));
		System.out.println("The overall weight of sweets reveived by the kid are:");
		System.out.println(sw.presents(e));
		
	}
}
