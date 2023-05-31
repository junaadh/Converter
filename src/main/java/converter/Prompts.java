package converter;

import javax.swing.JOptionPane;

public class Prompts {
    public static String options() {
        String[] options = { "Cancel", "D2B", "B2D" };
        int func = JOptionPane.showOptionDialog(null, "What convesion would you like to perform?", null, 0, 2, null,
                options, options);
        switch (func) {
            case 0:
                System.exit(func);

            case 1:
                return "decimalBinary";

            case 2:
                return "binaryDecimal";

        }
        return null;

    }

    public static String inputBox(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        return input;
    }

    public static void messageBox(String msg, String title, long num) {
        JOptionPane.showMessageDialog(null, msg + num, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void errorBox(String msg) {
        String title = "Error";
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
    }
}
