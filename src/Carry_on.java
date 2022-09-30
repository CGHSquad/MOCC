

import java.util.Scanner;
public class Carry_on {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String carryOn;
        System.out.println("Shall we carry on?");
        carryOn = scan.nextLine();

        while(!carryOn.equals("no")){
            System.out.println("Shall we carry on?");
            carryOn = scan.nextLine();
        }
    }
}
