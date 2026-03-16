public class test10 {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        int c = (a > b) ? a++ : b-- + ++a;
        System.out.println(c);

        System.out.println(a + " " + b);
    }
}
