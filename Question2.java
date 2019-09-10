import java.util.Scanner;
public class Question2 {

   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a=3,b=28,c=5,d=8,e=9,f=10,g=12,h=2,i=1,j=-19;
     
      int ans = a+b;
      int ans2 = ans + c;
      int ans3 = ans2 + d;
      int ans4 = ans3 + e;
      int ans5 = ans4 + f;
      int ans6 = ans5 + g;
      int ans7 = ans6 + h;
      int ans8 = ans7 + i;
      int ans9 = ans8 + j;
      
     System.out.print("running sum: "+a+" " +ans+" "+ans2+" "+ans3+" "+ans4+" "+ans5+" "+ans6+" "+ans7+" "+ans8+" "+ans9);
      
    }
    
}
