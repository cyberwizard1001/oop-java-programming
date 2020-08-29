import java.util.Date;
import java.util.Scanner;

class lab1_1{

/*Roll No
Name
Address
Emailid
Mobile No
Parents Occupation
Todays Date */

    public static void main(String[] args){

        int roll_no;
        String name;
        String Address;
        String email_id;
        long mobile;
        String occupation;
        Date today;

        Scanner input=new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter your roll number: ");
        roll_no = input.nextInt();

        System.out.println("Enter your home address: ");
        Address = input.next();

        System.out.println("Enter your e-mail ID:");
        email_id = input.next();

        System.out.println("Enter your phone number: ");
        mobile = input.nextLong();

        System.out.println("Enter parents' occupation: ");
        occupation = input.next();



        System.out.println("Output: ");
        System.out.println("Roll number: " + roll_no);
        System.out.println("Home address: " + Address);
        System.out.println("E-Mail ID: " + email_id);
        System.out.println("Phone number: " + mobile);
        System.out.println("Parents' occupation: " + occupation);


    }
}