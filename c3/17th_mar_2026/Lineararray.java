public class Lineararray {

    static int Linear(int arr[], int key){
     for(int i=0;i<arr.length;i++){
        if(arr[i] == key){
         return i;
        }
    }
    return -1;
} 

    public static void main(String[] args) {
        int arr[] = { 20, 30, 20, 40, 50, 30 };
        int key = 20;
        System.out.println(Linear(arr, key));

    }
}
