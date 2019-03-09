import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long annualsalary;
		annualsalary = sc.nextLong();
		if (annualsalary >= 0 && annualsalary <= 180000)
			System.out.println("nil");
		else if (annualsalary >= 181001 && annualsalary <= 300000)
			System.out.println("tax amount" + annualsalary * 0.01);
		else if (annualsalary >= 300001 && annualsalary <= 500000)
			System.out.println("tax amount" + annualsalary * 0.02);
		else if (annualsalary >= 500001 && annualsalary <= 1000000)
			System.out.println("tax amount" + annualsalary * 0.03);
		sc.close();

	}
}
