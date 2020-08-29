import java.util.Date;
import java.util.Scanner;

public class lab2_6 {



    static void Lines() {
        for (int i = 0; i < 80; i = i + 1) {
            System.out.print("_");
        }
        System.out.println();

    }

    static void personal_details()
    {
        String name;
        long service_no;
        String address,tariff;
        Byte phase,assessed_units;
        Date date;
        System.out.printf("Enter your name: ");
        name = name;
    }

    public static void main(String[] args)
    {
        int cc_charge, f_cost, md_penalty, pf_penalty, e_tax,total,adv,tbp;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Welcome! Enter your personal details, customer: ");
        personal_details();
        System.out.println("Enter values: ");
        System.out.printf("CC Charge: "); cc_charge = input.nextInt();
        System.out.printf("Fixed cost: "); f_cost = input.nextInt();
        System.out.printf("MD Penalty: "); md_penalty = input.nextInt();
        System.out.printf("PF penalty: "); pf_penalty = input.nextInt();
        System.out.printf("E-Tax: "); e_tax = input.nextInt();
        total = cc_charge + f_cost + md_penalty + pf_penalty + e_tax;
        System.out.printf("Enter advance amount: "); adv = input.nextInt();

        tbp = total-adv;
        System.out.printf("\t\t\t\t\tTamilNadu Generation And Distribution Corporation Ltd\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\tCBE/Metro EDC\n");
        System.out.printf("\t\t\t\t\t\t\t Assessment for the month of 07/2020\n");
        System.out.println("Service No : 03229010959");
        System.out.println("Consumer Name: S.Ramesh");
        System.out.println("Address : 3S PEELAMEDU");
        System.out.printf("Tariff  :LA1A\t\tPhase  :3\t\tAssessed units  :20\n\n");
        System.out.println("Bill date: 2020-07-20\t\tDue date: 2020-08-10\n");
        System.out.println();
        Lines();
        System.out.println("CC Charge    Fixed Cost    MD Penalty    PF Penalty    E-Tax    Amount");
        Lines();
        System.out.println("   "+cc_charge+"         "+f_cost+"       "+"      "+md_penalty+"             "+pf_penalty+"            "+e_tax+"                 "+total);
        Lines();
        System.out.println("Advance Amount          : Rs." + adv);
        System.out.println("Amount to be paid       : Rs." + tbp);
        System.out.printf("\n**This is only the current consumption charges. Arrears if any will be included in the bill and\nhave to be paid.");
        System.out.printf("This is an automatically generated email. Kindly do not reply to this mail.\n");
        System.out.printf("Click here for making Online Payment: https://www.tnebnet.org/awp/login\n\n");

    }
}
