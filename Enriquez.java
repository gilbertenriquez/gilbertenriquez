import java.util.Scanner;
public class Enriquez {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(" *********      ***            *             *      ");
        System.out.println(" *       *    *      *        ***          *   *    ");
        System.out.println(" *       *  *          *     *****        *     *   ");
        System.out.println(" *       *  *          *       *         *       *  ");
        System.out.println(" *       *  *          *       *        *         * ");
        System.out.println(" *       *  *          *       *         *       *  ");
        System.out.println(" *       *  *          *       *          *     *   ");
        System.out.println(" *       *    *      *         *           *   *    ");
        System.out.println(" *********       ***           *             *      ");
        
        //quest2
        float price,pizza,price2,price3;
        float toppings;
        System.out.println("enter the number of pizza:");
        pizza=in.nextFloat();
        System.out.println("enter the total number of toppings:");
        toppings=in.nextFloat();
        
        price = pizza * 12.00f + toppings * 1.50f;
        price2 = price * 0.05f;
        price3 = price + price2;
        
        System.out.printf(" reciept: number of pizza: %.0f", pizza);
        System.out.println("");
        System.out.printf("number of toppings: 5.0f",toppings);
        System.out.println("");
        System.out.println("cost (incl tax):"+price3);
        
                
        

    }
    
}
