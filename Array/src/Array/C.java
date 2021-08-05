package Array;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n=sc.nextInt();
		
		String a[]=new String[n];
		System.out.println("enter the insert element");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
			System.out.println(a[i]);
			
		}
		
	}

}
