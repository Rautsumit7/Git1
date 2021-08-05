package Array;

public class D {
	public static void main(String[] args) {
		
		int sum=0;
		int avg=0;
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum is:"+sum);
		avg=sum+a.length;
		System.out.println("Average is:"+avg);
	}

}
