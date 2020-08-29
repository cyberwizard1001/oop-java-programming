import java.util.Scanner;

public class lab1_6 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        double num1,num2;

        System.out.println("Enter number 1: ");
        num1 = input.nextDouble();

        System.out.println("Enter number 2: ");
        num2 = input.nextDouble();

        double sum = num1+num2;
        double diff = num1-num2;

        System.out.println("Sum: "+ sum);
        System.out.println("Difference: " + diff);

    }
}
