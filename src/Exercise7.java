import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Float.parseFloat;



public class Exercise7 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Salary  : ");
        String salaryString = scannerA.nextLine();
        float salary = parseFloat(salaryString);

        Scanner scannerB = new Scanner(System.in);
        System.out.print("401(k)  : ");

      
        String retirementString = scannerB.nextLine();
        float retirement = parseFloat(retirementString);


        Scanner scannerC = new Scanner(System.in);
        System.out.print("Federal : ");
        String federalString = scannerC.nextLine();
        float federal = parseFloat(federalString);



        Scanner scannerD = new Scanner(System.in);
        System.out.print("State   : ");
        String stateString = scannerD.nextLine();
        float state = parseFloat(stateString);


        double paycheck = salary / 24;
        double afterRetirement = paycheck - (paycheck * (retirement / 100));

      
        double federalTax = afterRetirement * (federal / 100);
        double stateTax = afterRetirement * (state / 100);
        double result = afterRetirement - federalTax - stateTax;


        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String finalResult = decimalFormat.format(result);

        System.out.print("\n$" + finalResult + "" + ".\n");

    }

}
