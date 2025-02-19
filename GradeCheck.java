import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=90){
            System.out.println("Grade:A");
        }
        else if(n>=80&&n<=89){
            System.out.println("Grade:B");
        }
        else if(n>=70&&n<=79){
            System.out.println("Grade:C");
        }
        else{
            System.out.println("Grade:F");
        }
    }
}
