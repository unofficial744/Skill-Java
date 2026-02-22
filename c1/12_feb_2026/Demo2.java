import java.util.Scanner;

public class Demo2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int val = sc.nextInt();

        if (val > 0) {
            if (val % 2 == 0) {
                System.out.println(val + " is Even.");
            } else {
                System.out.println(val + " is odd.");
            }
        } else if (val == 0) {
            System.out.println(val + " Zero input");
        } else {
            System.out.println(val + " is a Negative value");

        }
    }
}


//(a<b)?true:false