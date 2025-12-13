
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lets start swapping:\n \n \n ");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.err.print("Enter value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("swapping done ");
        System.out.println("value of A :" + a);
        System.out.println("value of B :" + b);
        
    }

}
