import java.util.Scanner;

public class lab3_set2Q2 {
    //customer id., name and unit consumed

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String name = input.next();
        int cust_id = input.nextInt();
        int units = input.nextInt();
        double unit_charge = 0;
        double charges = 0;
        double surcharge=0;
        double total_amt = 0;


        if(units<=199)
        {
            unit_charge = 1.20;
            charges = units * unit_charge;
        }

        else if((units>=200)&&(units<400))
        {
            unit_charge = 1.50;
            charges = units * unit_charge;
        }

        else if((units>=400)&&(units<600)){
            unit_charge = 1.80;
            charges = units * unit_charge;
        }

        else
        {
            unit_charge = 2.00;
            charges = units * unit_charge;
        }

        if(charges>400.0)
        {
            surcharge = 0.15*charges;

            total_amt = charges + surcharge;
        }

        else if(charges<100)
        {
            System.out.println("Minimum bill limit breached. Error.");
            System.exit(1);
        }

        else {total_amt = charges;}

        System.out.println("\nCustomer ID Number: "+cust_id);
        System.out.println("Customer name: "+name);
        System.out.println("Units consumed: "+units);
        System.out.println("Amount charges @Rs."+unit_charge+" per unit: "+charges);
        System.out.println("Surcharge amount: "+surcharge);
        System.out.println("Net amount paid by the customer: "+total_amt);
    }
}
