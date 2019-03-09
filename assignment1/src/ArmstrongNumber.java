
public class ArmstrongNumber {
public static void main(String[] args) {
	int number =153;
	int a;
	int c=0;
    int d;
	d=number;
	while(number!=0) {
		a=number%10;
		number=number/10;
		c=c+(a*a*a);
	}
if(d==c) 
	System.out.println("armstrong number");
	else 
		System.out.println("not armstrong number");
}
		
}
