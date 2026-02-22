import java.util.Scanner;
public class checkEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();

            if(num>0){
                if(num%2==0){
                    System.out.println(num + " is even number");
                }else{
                    System.out.println(num + " is odd number");
                }
            }else if(num==0){
                System.out.println("Zero");

            }else{
                System.out.println(num + " is Negative number");

            }
    }
}
