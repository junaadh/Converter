package converter;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary to Decimal Conveersion? [y/N]: ");
        String num = sc.nextLine();

        switch (num) {
            case "y":
                System.out.println("Insert binary number: ");
                String bin = sc.nextLine();
                System.out.println(ComputeMethods.binToDec(bin));
                break;
            case "n":
                System.out.println("Insert decimal number: ");
                int dec = sc.nextInt();
                System.out.println(ComputeMethods.decToBin(dec));
                break;

            default:
                throw new IllegalStateException("invalid input please select the correct operation");
        }
        
        //throw new IllegalStateException("unexpected error");
    }

}
