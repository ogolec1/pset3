import java.text.DecimalFormat;

import java.util.Scanner;



public class Exercise10 {

    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        String fahrString = scannerA.nextLine();
        double fahrenheit = Double.parseDouble(fahrString);



        double celsius = (fahrenheit - 32) * 5/9;

        double kelvin = ((fahrenheit - 32) * 5/9) + 273.15;


        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
      
        String finalKelvin = decimalFormat.format(kelvin);
        String finalCelsius = decimalFormat.format(celsius);


        System.out.print("\nCelsius : " + finalCelsius + "\nKelvin  : " + finalKelvin + "\n");
      
    }
}
