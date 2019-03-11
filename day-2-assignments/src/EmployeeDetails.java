import java.util.Scanner;
public class EmployeeDetails{
 	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter employeeId,name,monthlyBasic");
	Employee employee1=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());

	System.out.println("AnnualBasic  "+ employee1.getAnnualBasic());
	
        System.out.println("MonthlyGrossSalary "+ employee1.getMonthlyGrossSalary());
        
	System.out.println("AnnualGrossSalary "+ employee1.getAnnualGrossSalary());
	
	System.out.println("MonthlyDeducation " + employee1.getMonthlyDeduction());
	
	System.out.println("MonthlyTakeHome " + employee1.getMonthlyTakeHome());
	
	System.out.println("AnnualTakeHome " + employee1.getAnnualTakeHome());

}
}