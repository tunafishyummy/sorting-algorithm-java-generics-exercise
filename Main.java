import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sorting Algorithm");
        System.out.println("Sort integers or strings? (Enter 'int' or 'str')");
        
        String firstinput = scanner.nextLine();

        if (firstinput.equals("int")) {
            System.out.println("Enter integers separated by spaces:");
        } else if (firstinput.equals("str")) {
            System.out.println("Enter strings separated by spaces:");
        } else {
            System.out.println("Invalid input. Please enter 'int' or 'str'.");
        }

    }
}
