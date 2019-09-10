import java.util.Scanner;

public class Question1 {

    
    public static void main(String[] args) 
    {
        
       Scanner in = new Scanner(System.in);
       double ftax,stax,sstax,mtax,pp,HI,netpay,total_netpay ;
       
       System.out.println("input employee name:");
       String employee = in.nextLine();
       System.out.println("groos amount: ");
       int gross = in.nextInt();
       
      ftax = gross * 0.15;
      stax = gross * 0.035;
      sstax = gross * 0.0575;
      mtax = gross * 0.0275;
      pp = gross * 0.05;
      HI = 75;
      netpay = ftax + stax + sstax + mtax + pp + HI;
      total_netpay = gross - netpay;
      
        System.out.println(" name : "+ employee);
        System.out.printf("gross amount:$.2f ", gross);
        System.out.println("");
        System.out.printf("federal tax: $%.2f ",ftax);
        System.out.println("");
        System.out.printf("state tax:$%.2f ",stax);
        System.out.println("social security tax:$%.2f "+ sstax);
        System.out.println("");
        System.out.printf("medicare tax:$%.2f ",mtax);
        System.out.println("");
        System.out.printf("pension plan:$%.2f ",pp);
        System.out.println("");
        System.out.printf("Health Insurance:$%.2f",HI);
        System.out.println("");
        System.out.printf("netpay: $%.2f" , total_netpay);
        
        
        
 
         
    }
    
}
