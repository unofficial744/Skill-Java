import java.util.*;
public class Input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;


        System.out.println("Enter: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the :"+ size);

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("______________");

        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Total Even: "+evenCount);
        System.out.println("Total Odd: "+oddCount);
        sc.close();
    }
}
