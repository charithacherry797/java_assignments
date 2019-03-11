import java.util.Scanner;
public class Rectangle{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length,breadth");
    
     Rectangle1 rectangleShape=new Rectangle1(sc.nextDouble(),sc.nextDouble());
     
     System.out.println("areaOfRectangle " + rectangleShape.areaOfRectangle());

     System.out.println("perimeterOfRectangle " + rectangleShape.perimeterOfRectangle());
    
     System.out.println(rectangleShape.tostring());
      
     Rectangle1 rectangleShape1=new Rectangle1(sc.nextDouble(),sc.nextDouble());
     
     System.out.println("areaOfRectangle " + rectangleShape1.areaOfRectangle());

     System.out.println("perimeterOfRectangle " + rectangleShape1.perimeterOfRectangle());
      
     System.out.println(rectangleShape1.tostring());

     if(rectangleShape.areaOfRectangle()==rectangleShape1.areaOfRectangle())
      System.out.println("Area of Rectangle are same");
      else
      System.out.println("Area of Rectangle are not same");
      
   }
}     