import java.util.Scanner;

public class lab1_3 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        double rate, interest, amount;

        int principal, no_of_years;

        System.out.println("Enter the rate of interest: ");
        rate = input.nextDouble();

        System.out.println("Enter the Principal amount");
        principal = input.nextInt();

        System.out.println("Enter the number of years (period): ");
        no_of_years = input.nextInt();

        interest = (principal*no_of_years*rate)/100;
        amount = principal + interest;

        System.out.println("The interest to be paid is: " + interest);
        System.out.println("Total Amount: " + amount);
        
    }
}
