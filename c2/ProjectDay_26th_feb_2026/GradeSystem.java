import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3: ");
        int marks3 = sc.nextInt();

        System.out.println("Enter marks of Subject 4: ");
        int marks4 = sc.nextInt();

        System.out.println("Enter marks of Subject 5: ");
        int marks5 = sc.nextInt();

        int Totalmarks = marks1 + marks2 + marks3 + marks4 + marks5;

        double Percentage = (Totalmarks / 5) ;
        // double Percentage = (Totalmarks * 100) / 500 ;


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