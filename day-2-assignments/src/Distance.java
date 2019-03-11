public class Distance
{
    private int feet;
    private double inches;
               public void setFeetAndInches(int feet,double inches)
               {
 	            this.feet=feet;
 		    this.inches=inches;
               }
               public void displayFeetAndInches()
               {
	               System.out.println("distance in feet "+feet+ ","+inches+ "inches");
	       } 
	       public Distance sumOfTwoDistance(Distance d)
               {
	                Distance d1=new Distance();
                        d1.inches=this.inches+d.inches;
                        d1.feet=0;
                        if(d1.inches>=10)
                {   
                        d1.inches=d1.inches-10;
                        d1.feet++;
                }
                        d1.feet +=this.feet + d.feet;
                        return d1;
                }
}