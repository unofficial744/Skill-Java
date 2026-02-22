import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int val = sc.nextInt();

        int fact = 1;
        for(int i=1;i<=val;i++){
            fact*=i;
        }

        System.out.println("Factorial of "+ val + " is "+ fact);

        sc.close();
    }
}