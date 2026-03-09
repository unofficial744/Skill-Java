import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Totalmarks = 0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the Number: " + i);
            Totalmarks += sc.nextInt();
        }
        double Percentage = (Totalmarks * 100.0) / 500 ;
        System.out.println("Percentage = " + Percentage + "%");

        if (Percentage >= 90) {
            System.out.println(Percentage + " Pass with 'A' Grade ");
        } else if (Percentage >= 80) {
            System.out.println(Percentage + " Pass with 'B' Grade ");
        } else if (Percentage >= 70) {
            System.out.println(Percentage + " Pass with 'C' Grade ");
        } else if (Percentage >= 60) {
            System.out.println(Percentage + " Pass with 'D' Grade ");
        } else if (Percentage >= 50) {
            System.out.println(Percentage + " Pass with 'E' Grade ");
        }else{
            System.out.println("Failed");
        }
        sc.close();

    }
}
