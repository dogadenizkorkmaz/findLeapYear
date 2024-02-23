import java.util.Scanner;
public class FindLeapYear {
    public static void main(String[] args) {
        //define integer
        int year;
        //define scanner
        Scanner userInput = new Scanner(System.in);
        //get value from user
        System.out.print("Enter The Year: ");
        year = userInput.nextInt();
        //calculate and print
        if (year >= 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("This year is a \"leap year\".");
                    }
                    else {
                        System.out.println("This year is not a \"leap year\". ");
                    }
                }else {
                    System.out.println("This year is a \"leap year\".");
                }
            }
            else {
                System.out.println("This year is not a \"leap year\".");
            }
        }
    }
}