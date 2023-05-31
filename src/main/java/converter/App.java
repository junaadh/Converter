package converter;

//import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Binary to Decimal Conveersion? [y/N]: ");
         * String num = sc.nextLine();
         */

        String func = Prompts.options();
        long num;
        String raw, title = "Conversion Success";

        switch (func) {
            case "binaryDecimal":
                /*
                 * System.out.println("Insert binary number: ");
                 * String bin = sc.nextLine();
                 * sc.close();
                 * System.out.println(num);
                 */
                raw = Prompts.inputBox("Insert binary number");
                num = ComputeMethods.binToDec(raw);
                Prompts.messageBox("Binary number " + raw + " in decimals is: ", title, num);
                break;
            case "decimalBinary":
                /*
                 * System.out.println("Insert decimal number: ");
                 * int dec = sc.nextInt();
                 * sc.close();
                 * System.out.println(num);
                 */
                raw = Prompts.inputBox("Insert Decimal number");
                num = ComputeMethods.decToBin(raw);
                Prompts.messageBox("Decimal number " + raw + " in binary is: ", title, num);
                break;

            default:
                // sc.close();
                throw new IllegalStateException("invalid input please select the correct operation");
        }

        // throw new IllegalStateException("unexpected error");
    }

}
