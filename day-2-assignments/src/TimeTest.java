import java.util.*;
public class TimeTest{
      public static void main(String[] args)
      {
      Scanner sc=new Scanner(System.in);
      int hours;
      int minutes;
      System.out.println("enter the hours values");
      hours =sc.nextInt();
      System.out.println("enter the minutes values");
      minutes=sc.nextInt();
     
      Time t2=new Time();
      t2.setTime(hours,minutes);
      this.displayTime();
      System.out.println("enter the hours values");
      hours =sc.nextInt();
      System.out.println("enter the hours minutes");  
      minutes =sc.nextInt();    
     
      Time t4=new Time();
      t4.setTime(hours,minutes);
      t4.displayTime();
     
      Time t5=new Time();
      t5=t3.sumOfTime(hours,minutes);
      t5.displayTime();
     }
}         