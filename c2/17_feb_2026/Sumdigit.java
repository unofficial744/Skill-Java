import java.util.Scanner;
public class Sumdigit {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int val = sc.nextInt();
        int n = val;
        int sum = 0;
        while (n>0) {
            int lastdigi = n % 10;
            sum += lastdigi;
            n /= 10;
        }
        System.out.println("The sum of digit :"+ val + " is "+ sum);
        sc.close();
    }
}
