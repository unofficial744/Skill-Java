import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sum :");
        int val = sc.nextInt();

        System.out.print("Enter the sum :");
        int val1 = sc.nextInt();

        int sum = val+val1;

        System.out.println(sum);
        sc.close();
    }
}
