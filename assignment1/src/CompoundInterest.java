import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principalamount;
		float annualrate;
		int time;
		principalamount = sc.nextInt();
		annualrate = sc.nextFloat();
		time = sc.nextInt();
		float simpleinterest= principalamount*annualrate*time;
		System.out.println(simpleinterest);
		int compoundperyear;
		compoundperyear =sc.nextInt();
		float compoundinterest =(float) (principalamount*Math.pow((1+(annualrate/compoundperyear)),compoundperyear*time));
		System.out.println(compoundinterest);
		sc.close();
		
	}

}
