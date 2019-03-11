public class Time
{
    private int hours;
    private int minutes;
       public void setTime(int hour,int minutes)
       {
             this.hours=hours;
             this.minutes=minutes;
       }
       public void displayTime()
       {
              System.out.println(hours+ "Hours" +minutes+ "Minutes");
       }
       public Time sumOfTimes(Time number)
       {
               Time t3=new Time();
               t3.hours=this.hour+number.hours;
               t3.minutes=this.minutes+number.minutes;
               if(time3.minutes >=60)
       {
               t3.minutes=.minutes-60;
               t3.hours=t3.hours+1;
       }
              return t3;
} 