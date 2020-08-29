import java.util.Scanner;

public class lab2_4 {
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int hours;
        //Write a program to convert time into minute and seconds
        System.out.println("Enter time in hours: ");
        hours = input.nextInt();

        System.out.println("Time in minutes: " + hours*60 + " minutes");
        System.out.println("Time in seconds: " + hours*60*60 + " seconds");

    }
}
