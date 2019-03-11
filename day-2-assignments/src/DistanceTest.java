import java.util.*;
public class DistanceTest{
      public static void main(String[] args)
      {
      Scanner sc=new Scanner(System.in);
      int feet;
      double inches;
      Distance d2=new Distance(); 
      feet=sc.nextInt();
      inches=sc.nextDouble();
      d2.setFeetAndInches(feet,inches);
      d2.displayFeetAndInches();
 
      Distance d3=new Distance();
      feet=sc.nextInt();
      inches=sc.nextDouble();
      d3.setFeetAndInches(feet,inches);
      d3.displayFeetAndInches();
      
      Distance d1;
      d1=d2.sumOfTwoDistance(d3);
      d1.displayFeetAndInches();
}
}