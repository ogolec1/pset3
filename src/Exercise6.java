import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Float.parseFloat;


public class Exercise6 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Wage      : ");
        String wageString = scannerA.nextLine();
        float wage = parseFloat(wageString);

        Scanner scannerB = new Scanner(System.in);
        System.out.print("Monday    : ");
        String mondayString = scannerB.nextLine();
        float monday = parseFloat(mondayString);

        Scanner scannerC = new Scanner(System.in);
        System.out.print("Tuesday   : ");
        String tuesdayString = scannerC.nextLine();
        float tuesday = parseFloat(tuesdayString);

        Scanner scannerD = new Scanner(System.in);
        System.out.print("Wednesday : ");
        String wednesdayString = scannerD.nextLine();
        float wednesday = parseFloat(wednesdayString);

        Scanner scannerE = new Scanner(System.in);
        System.out.print("Thursday  : ");
        String thursdayString = scannerE.nextLine();

        float thursday = parseFloat(thursdayString);


        Scanner scannerF = new Scanner(System.in);
        System.out.print("Friday    : ");
        String fridayString = scannerF.nextLine();
        float friday = parseFloat(fridayString);

        Scanner scannerG = new Scanner(System.in);
        System.out.print("Saturday  : ");
        String saturdayString = scannerG.nextLine();
        float saturday = parseFloat(saturdayString);

        Scanner scannerH = new Scanner(System.in);
        System.out.print("Sunday    : ");
        String sundayString = scannerH.nextLine();
        float sunday = parseFloat(sundayString);

        double total = wage * (monday + tuesday + wednesday + thursday + friday + saturday + sunday);

        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalWage = decimalFormat.format(total);

        System.out.print("\n$" + finalWage + "" + ".\n");

    }

}
