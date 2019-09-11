import java.util.Scanner;
public class Activity1 
{
    

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int time_second,seconds,minutes,hours,time;
      
      System.out.println("enter time in seconds: ");
      time_second = in.nextInt();
      
       seconds = time_second %60;
       minutes = (time_second % 3600)/60;
       hours = time_second / 3600;
       
        System.out.println("time is" + " "+hours +"hour/s"+" "+minutes+" "+"minutes/s"+" "+seconds +" "+ "seconds");
       
    }
    
}
