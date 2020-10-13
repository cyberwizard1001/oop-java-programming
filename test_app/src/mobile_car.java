/*
define a class called as mobile car - come up with attrinutes

getter, setter

constructors - overloaded

static var - Serial Number

Call in main

give make - get year

find oldest car - print

 */
import java.util.Date;
import java.util.Scanner;

public class mobile_car {

    static int Serial;
    static int Engine_no;
    static int Chassis_no;

    String name;
    Date DoM;
    String model;
    int year;
    int mileage;
    boolean airbags;
    boolean abs;         //calculate safety star rating
    boolean disc;
    double price;
    String fuel;
    String capacity;
    int seating;
    String type;

    public mobile_car()
    {
        Serial = 0;
        Serial++;
        Engine_no = 1000000;
        Engine_no++;
        Chassis_no = 9000000;
        Chassis_no++;
        DoM = new Date();
    }

    public mobile_car(String t)
    {
        this();
        type = t;
        new_car();
    }

    public mobile_car(String f,String t)
    {
        this();
        type = t;
        fuel = f;
        new_car();
    }


    public String ret_name()
    {
        return name;
    }

    public void new_car()
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Serial number: "+Serial);
        System.out.println("Chassis ID: "+Chassis_no);
        System.out.println("Engine ID: "+Engine_no);
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.print("Date of manufacture: ");

        System.out.println(DoM.toString());
        System.out.print("Model: ");
        model = input.nextLine();
        System.out.print("Year: ");
        year = DoM.getYear();
        System.out.println(year);
        System.out.print("Mileage: ");
        mileage = input.nextInt();
        System.out.println("Safety features: (Enter y/n) ");
        System.out.print("Airbags: ");
        char temp = input.next().charAt(0);

            if(temp=='y')
                airbags = true;

            else    airbags = false;

        System.out.print("ABS: ");
        char temp1 = input.next().charAt(0);

            if(temp1=='y')
                abs = true;

            else    disc = false;

        System.out.print("Disc brakes: ");
        char temp2 = input.next().charAt(0);

            if(temp=='y')
                abs = true;

            else    disc = false;

        System.out.print("Price: ");
        price = input.nextDouble();

        System.out.print("Capacity: ");
        int cap;
        if (fuel=="Petrol"||fuel=="Diesel")
        {
            System.out.print("(L)");
            cap = input.nextInt();
            capacity = cap+"L";
        }

        else
        {
            System.out.print("(KwH)");
            cap = input.nextInt();
            capacity = cap+"KwH";
        }

        System.out.print("Seating: ");
        seating = input.nextByte();







    }





}
