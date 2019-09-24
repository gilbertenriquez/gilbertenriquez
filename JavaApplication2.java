import java.util.Scanner;

public class JavaApplication2 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("enter todays day:");
        int Day=in.nextInt();
        System.out.println("enter the number of days elapsed since today:");             
       int numberday=in.nextInt();
       
       String numday="";
       String days="";
       
       switch(Day%7){
           case 0:
               days = ("SUNDAY");
               break;
           case 1:
               days = ("MONDAY");
               break;
           case 2:
               days = ("TUESDAY");
               break;
           case 3:
               days = ("WEDNESDAY");
               break;
           case 4:
               days = ("THURSDAY");
               break;
           case 5:
               days = ("FRIDAY");
               break;
           case 6:
                days = ("SATURDAY");
               break; 
           default: System.out.println("invalid day");
       }
       switch(numberday%7){
            case 0:
               numday=("SUNDAY");
               break;
           case 1:
               numday = ("MONDAY");
               break;
           case 2:
               numday = ("TUESDAY");
               break;
           case 3:
               numday = ("WEDNESDAY");
               break;
           case 4:
               numday = ("THURSDAY");
            break;
           case 5:
               numday =("FRIDAY");
               break;
           case 6:
               numday =("SATURDAY");
               break;  
          
        }
               System.out.println("today is" +days+ "and the future day is" +numday);
       }
    }
    

