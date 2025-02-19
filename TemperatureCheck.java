import java.util.Scanner;
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Whether:");
        int n=sc.nextInt();
        if(n>30){
            System.out.println("Hot Outside");
        }
        else if(n>15&&n<=30){
            System.out.println("Normal Outside");
        }
        else{
            System.out.println("Cold Outside");
        }
    }
}
