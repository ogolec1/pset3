import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Float.parseFloat;


public class Exercise5 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        String homeworkOneString = scannerA.nextLine();
        float homework1 = parseFloat(homeworkOneString);

        Scanner scannerB = new Scanner(System.in);
        System.out.print("Homework 2 : ");
        String homeworkTwoString = scannerB.nextLine();
        float homework2 = parseFloat(homeworkTwoString);

        Scanner scannerC = new Scanner(System.in);
        System.out.print("Homework 3 : ");
        String homeworkThreeString = scannerC.nextLine();
        float homework3 = parseFloat(homeworkThreeString);

        Scanner scannerD = new Scanner(System.in);
        System.out.print("Quiz 1     : ");
        String quizOneString = scannerD.nextLine();
        float quiz1 = parseFloat(quizOneString);

        Scanner scannerE = new Scanner(System.in);
        System.out.print("Quiz 2     : ");
        String quizTwoString = scannerE.nextLine();
        float quiz2 = parseFloat(quizTwoString);

        Scanner scannerF = new Scanner(System.in);
        System.out.print("Test 1     : ");
      

        String testOneString = scannerF.nextLine();

        float test1 = parseFloat(testOneString);
      
      String pattern = "0.00";
      DecimalFormat decimalFormat = new DecimalFormat(pattern);
      String finalGrade = decimalFormat.format(grade);


      
        double grade = .15*((homework1 + homework2 + homework3)/3) + .35*((quiz1 + quiz2)/2) + .5*(test                                                                                   


        System.out.print("\n" + finalGrade + "%." + "\n");

    }

}
