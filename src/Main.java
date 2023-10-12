import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean validInput1 = false;
        boolean validInput2 = false;

        do {
            System.out.println("Enter Length of Side 1: ");
            if(scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if(side1 > 0) {
                    validInput1 = true;
                } else {
                    System.out.println("You've entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You've entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validInput1);
        do {
            System.out.println("Enter Length of Side 2: ");
            if(scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if(side2 > 0) {
                    validInput2 = true;
                } else {
                    System.out.println("You've entered an invalid value. Please try again");
                    scan.nextLine();
                }
            } else {
                System.out.println("You've entered an invalid value. Please try again");
                scan.nextLine();
            }
        } while (!validInput2);

        area = side1 * side2;
        perimeter = (side1 * 2) + (side2 * 2);
        diagonal = (Math.pow(side1, 2)) + (Math.pow(side2, 2));

        System.out.printf("\n%-10s %5.2f", "Side 1", side1);
        System.out.printf("\n%-10s %5.2f", "Side 2", side2);
        System.out.printf("\n%-10s %5.2f", "Area", area);
        System.out.printf("\n%-10s %5.2f", "Perimeter", perimeter);
        System.out.printf("\n%-10s %5.2f", "Diagonal", diagonal);
    }
}