
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENETER THE BASE  AND LENGTH IN CMS ");

        Double base = input.nextDouble();
        Double height = input.nextDouble();

        Double area = 0.5  * base * height;
        System.out.println("area is :"+ area +"cms2" );
    }

}
