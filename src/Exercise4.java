import java.text.DecimalFormat;

import java.util.Scanner;

import static java.lang.Float.parseFloat;



public class Exercise4 {

    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);

        System.out.print("Height : ");

        String heightString = scannerA.nextLine();

        float height = parseFloat(heightString);

        Scanner scannerB = new Scanner(System.in);

        System.out.print("Width : ");

        String widthString = scannerB.nextLine();

        float width = parseFloat(widthString);

        double cmHeight = height * 2.54;

        double cmWidth = width * 2.54;

        double perimeter = 2 * (cmHeight + cmWidth);



        String pattern = "###,##0.00";

        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String finalPerimeter = decimalFormat.format(perimeter);



        System.out.print("\n" + finalPerimeter + " centimeters." + "\n");

    }

}
