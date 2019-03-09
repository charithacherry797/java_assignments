import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int search;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
				n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("enter"+n+ "integer");
		for(i=0;i<n;i++)
			array[i]=sc.nextInt();
		System.out.println("enter value to search");
		search=sc.nextInt();
		for(i=0;i<n;i++) {
			if(array[i]==search) {
				System.out.println("search number" +i);
			}
		}
		if(i==n)
			System.out.println("search" +"present in array");
		sc.close();

	}

}
