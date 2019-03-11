
 public class Employee{

           private int employeeId;
           private String name;
           private double monthlyBasic;
           private static int medical = 1250;
           private static int conveyance =800;
           private double hra =0.50*monthlyBasic;
           private static double pf;
           private static double esic;

               Employee(int employeeId,String name,double monthlyBasic)
               {
                    this.employeeId=employeeId;
                    this.name=name;
                    this.monthlyBasic=monthlyBasic;           
               }   
  
                 public double getAnnualBasic(){
                      return (12 * monthlyBasic);
                 }
		
                public double getMonthlyGrossSalary(){
		return (monthlyBasic + hra + medical + conveyance);
		}

		public double getAnnualGrossSalary(){
		return 12 * getMonthlyGrossSalary();
		}

                public double getMonthlyDeduction(){
		double professionalTax=0;
		double esic=0;
 		if(monthlyBasic*0.10<6500)
                {
		pf=monthlyBasic*0.10;
		}
		else
		pf=6500;
		
		if(monthlyBasic<=5000)
		{
		  esic=monthlyBasic*(4.75/100);
		}
		
                if(getMonthlyGrossSalary()<=1000)
		professionalTax=50;
		else
                professionalTax=100;
		
              
		return pf+esic+professionalTax;
		}
                

               public double  getMonthlyTakeHome(){
               return (getMonthlyGrossSalary()- getMonthlyDeduction());
		}
             
 
                public double getAnnualTakeHome() {
                return (12 * getMonthlyTakeHome());
		}
      

}



