import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
        System.out.println("Enter a three digit number:");
        int number = in.nextInt();
        
        int number1 = (number/100);
        int number2 = (number%10);
           
            if(number1==number2){
                System.out.println(number+"is palindrome number");
            }
            else 
            System.out.println(number+"is not a palindrome number");
    }     
}

