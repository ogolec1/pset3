import java.util.Scanner;

import java.text.DecimalFormat;

import static java.lang.Float.parseFloat;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Height : ");
        String heightString = scannerA.nextLine();
        float height = parseFloat(heightString);
        Scanner scannerB = new Scanner(System.in);
        System.out.print("Width : ");
        String widthString = scannerB.nextLine();
        float width = parseFloat(widthString);
        double mmHeight = height * 2.54 * 10;
        double mmWidth = width * 2.54 * 10;
        double area = mmWidth * mmHeight;


        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalArea = decimalFormat.format(area);

        System.out.print("\n" + finalArea + " square millimeters." + "\n");

    }

}
