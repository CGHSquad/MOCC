import java.util.Scanner;
public class are_we_there_yet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.println("Give a number: ");
        number = scan.nextInt();

        while(number != 4){
            System.out.println("Give a number: ");
            number = scan.nextInt();
        }

    }
}
