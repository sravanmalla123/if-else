import java.util.Scanner;
public class Eligibleforvotingornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter AGE:");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote");
        }
    }
}
