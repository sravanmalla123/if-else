import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Number:");
         int n=sc.nextInt();
         if(n%2==0){
            System.out.println("Even Number");
         }
         else{
            System.out.println("Odd Number");
         }
         
    }
}
