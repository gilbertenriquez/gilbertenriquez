import java.util.Scanner;
import java.util.Random;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        
        //using math random class
        //int num1 = (int)(Math.random()*10);
        //int num2 = (int)(Math.random()*10);
        
       //display question
        System.out.println("what is"+number1+ "+" + number2+ "?");
        int studentanswer = in.nextInt();
        int sum = number1 + number2;
        
        if(studentanswer == sum){
            System.out.println("Correct.");
        }
        else
            System.out.println("Wrong");
        
        
    }
    
}
