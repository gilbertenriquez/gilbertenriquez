import java.util.Scanner;
public class Activity2 {

  
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     double cost,distance,miles_gallon,price_gallon;
        System.out.println("enter the driving distance: ");
        distance = in.nextDouble();
        System.out.println("enter miles per gallon: ");
        miles_gallon = in.nextDouble();
        System.out.println("enter price per galoon: ");
        price_gallon = in.nextDouble();
        
        cost = (distance/miles_gallon)*price_gallon;
        
        System.out.printf("cost of driving:$%.2f", cost);
    }
    
}
