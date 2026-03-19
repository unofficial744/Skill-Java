import java.util.*;

public class ReverseArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entet Size of: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}