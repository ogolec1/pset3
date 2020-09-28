import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Students  : ");

      
        String studentString = scannerA.nextLine();
        int students = Integer.parseInt(studentString);


        Scanner scannerB = new Scanner(System.in);
        System.out.print("Teachers  : ");
        String teacherString = scannerB.nextLine();
        int teachers = Integer.parseInt(teacherString);

        Scanner scannerC = new Scanner(System.in);
        System.out.print("Capacity  : ");
        String capacityString = scannerC.nextLine();
        int capacity = Integer.parseInt(capacityString);

        int totalPeople = students + teachers;
        int buses = (totalPeople / capacity) + 1;
        int overflow = totalPeople % capacity;


        System.out.print("\nBuses required      : " + buses + "\nOverflow passengers : " + overflow + "\n");

    }
}
