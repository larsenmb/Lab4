import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
                Scanner scnr = new Scanner(System.in);
                System.out.println("Enter your car's MPG rating as a positive integer\n");
                int MPG = scnr.nextInt();
                if (MPG <= 0) {
                    System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                    return;
                }
                System.out.println("Enter your car’s tank capacity (gallons) as a positive decimal number:\n");
                double TC = scnr.nextDouble();
                if (TC < 0.0 && TC % 1 == 0) {
                    System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
                    return; 
                }
                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%)");
                double TP = scnr.nextDouble();
                if (TP <= 0 && TP >= 100) {
                    System.out.println("ERROR: PERCENTAGE MUST BE A DECMIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
                    return;

                }

                double rawRange = MPG * TC * (TP *0.01);
                int Range = (int) rawRange;

                if (Range <= 25 ) {
                    System.out.println("Attention! Your current estimated range is running low: " + Range + " miles left!!!");
                } else {
                    System.out.println("Keep driving! Your current estimated range is: " + Range + " miles!");
                }


            }






        }







