package converter;

import java.lang.reflect.Array;

public class ComputeMethods {

    private static int numChar(char charc[], int index) {
        char num = Array.getChar(charc, index);
        int numb = Character.getNumericValue(num);
        return numb;
    }

    public static int binToDec(String bin) {
        int dec = 0;
        char arr[] = (bin.replaceAll("\\s+", "")).toCharArray();
        int binLen = arr.length;
        switch (binLen) {
            case 8:
                dec = 128 * numChar(arr, 0) + 64 * numChar(arr, 1) + 32 * numChar(arr, 2) + 16 * numChar(arr, 3)
                        + 8 * numChar(arr, 4) + 4 * numChar(arr, 5) + 2 * numChar(arr, 6) + 1 * numChar(arr, 7);
                return dec;
            case 4:
                dec = 8 * numChar(arr, 0) + 4 * numChar(arr, 1) + 2 * numChar(arr, 2) + 1 * numChar(arr, 3);
                return dec;

            default:
                Prompts.errorBox("Supports only 8bits rn. Inserted binary " + bin + " is not supported.");
                throw new IllegalArgumentException("Supports only 8bits rn");
        }

    }

    public static long decToBin(String dec) {
        int remainder = 0, i = 1;
        int decimal = Integer.parseInt(dec);
        long bin = 0;
        while (decimal != 0) {
            remainder = decimal % 2;
            decimal /= 2;
            bin += remainder * i;
            i *= 10;
        }

        return bin;
    }
}
