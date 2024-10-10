import java.util.Scanner;

public class MenuRunner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");

        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");

        int number2 = scanner.nextInt();

        System.out.println(" 1 - Add");
        System.out.println(" 2 - Subtract");
        System.out.println(" 3 - Divide");
        System.out.println(" 4 - Multiply");

        System.out.print("Choose your Option: ");

        int choice = scanner.nextInt();

        performOperationUsingSwitch(choice, number1, number2);

    }

    private static void performOperationUsingNestedIfElse(int choice, int number1, int number2)
    {
        if (choice == 1)
        {
            System.out.println("The addition is : " + (number1 + number2));
        } else if (choice == 2)
        {
            System.out.println("The subtraction is : " + (number1 - number2));
        } else if (choice == 3)
        {
            System.out.println("The division is : " + (number1 / number2));
        } else if (choice == 4)
        {
            System.out.println("The multiplication is : " + (number1 * number2));
        } else
        {
            System.out.println("Invalid Choice");
        }
    }

    private static void performOperationUsingSwitch(int choice, int number1, int number2)
    {
        switch (choice)
        {
            case 1:
                System.out.println("The addition is : " + (number1 + number2));
                break;
            case 2:
                System.out.println("The subtraction is : " + (number1 - number2));
                break;
            case 3:
                System.out.println("The division is : " + (number1 / number2));
                break;
            case 4:
                System.out.println("The multiplication is : " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
