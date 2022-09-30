import java.util.Scanner;
public class only_positives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Input a number");
            int number = scan.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unfit number");
                continue;
            }

            int square = (int) Math.pow(number, 2);
            System.out.println(square);
        }


    }
}
