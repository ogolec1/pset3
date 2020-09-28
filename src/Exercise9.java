import java.util.Scanner;
import static java.lang.Float.parseFloat;


public class Exercise9 {
  
    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        System.out.print("Amount : ");
        String moneyString = scannerA.nextLine();

        float money = parseFloat(moneyString);
        int intWholeDollars = (int) money;
        float wholeDollars = (float) intWholeDollars;
        float change = money - wholeDollars;



        int tentativeQuarters = intWholeDollars * 4;

        float wholeChange = change * 100;

        int intChange =  (int) wholeChange;
        int moreQuarters = intChange / 25;
        int finalQuarters = tentativeQuarters + moreQuarters;

        int beforeDChange = intChange - (moreQuarters * 25);
        int finalDimes = beforeDChange / 10;

        int beforeNChange = beforeDChange - (finalDimes * 10);
        int finalNickels = beforeNChange / 5;


        int finalPennies = beforeNChange - (finalNickels * 5);

        System.out.print("\nQuarters : " + finalQuarters + "\nDimes    : " + finalDimes + "\nNickels  : " + finalNickels + "\nPennies  : " + finalPennies + "\n");

    }

}
