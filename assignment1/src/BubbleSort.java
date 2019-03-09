import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		int j;
		int swap;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input numbers");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("enter" +n+ "number");
		for(i=0;i<n;i++)
			array[i]=sc.nextInt();
		for(i=0;i<n;i++) {
        for(j=0;j<n-i-1;j++) { 
        	if(array[j]<array[j+1]);
		{
			swap = array[j];
			array[j]=array[j+1];
			array[j+1]=swap;
		}
        }
		}
	
		System.out.println("sorted list of numbers:");
		for(i=0;i<n;i++)
		System.out.println(array[i]);	
		sc.close();
			
	}
		
	}
		

	


