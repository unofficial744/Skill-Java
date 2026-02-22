import java.util.Scanner;

    public class Result{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println(num + " is a +ve number");
            } if (num == 0) {
                System.out.println(num + " is Zero");
            } else {
                System.out.println(num + " is a negative");
            }

        }
    }
