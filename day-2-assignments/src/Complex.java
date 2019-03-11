        public class Complex
	{
		private double real;
		private double imaginary;
   
		public void setRealAndImaginary(double real,double imaginary)
		{
			this.real=real;
       			this.imaginary=imaginary;
   		}
   		
		public void displayComplexNumber()
		{
      			System.out.println("complex number = "+real+ " + "+ "i" + "(" + imaginary + ")" );
   		}
   	
		public Complex sumOfTwoComplexNumbers(Complex c)
		{
       			Complex temp=new Complex();
       			temp.real=this.real+c.real;
       			temp.imaginary=this.imaginary+c.imaginary;
       			return temp;
  		}
	}