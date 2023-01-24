import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnterName();

    }
    static void EnterName() {
        // code to be executed
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the User Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        String input = scanner.nextLine();

        LocalDate dob = LocalDate.parse(input);
        System.out.println("name :"+name);
        System.out.println("You are " + calculateAge(dob)+" years old.");
    }

    public static int calculateAge(LocalDate dob)
    {

        LocalDate curDate = LocalDate.now();

        if ((dob != null) && (curDate != null))
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}