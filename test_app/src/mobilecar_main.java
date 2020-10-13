import java.util.Scanner;

public class mobilecar_main {

    static public void main(String[] args)
    {

        mobile_car cars[] = new mobile_car[45];

        cars[0] = new mobile_car();
        int i = 0;

        System.out.println("Welcome! Choose your operation: ");
        System.out.println("1. Add new car");
        System.out.println("2. Find year of manufacture");
        System.out.println("3. Find oldest car");

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int choice = input.nextByte();

        switch (choice)
        {
            case 1:
            {
                i++;
                System.out.println("Choose fuel:\n 1. Petrol / diesel\n2. Electric");
                choice = input.nextByte();
                System.out.println("Choose type: a. Sedan\nb. Limo\nc. Hatchback");
                char type = input.next().charAt(0);
                if(choice==1)
                {
                    switch (type)
                    {
                        case 'a': cars[i] = new mobile_car("Fossil","Sedan"); break;
                        case 'b': cars[i] = new mobile_car("Fossil","Limo"); break;
                        case 'c': cars[i] = new mobile_car("Fossil","Hatchback"); break;
                        default: System.out.println("Error. Try again");
                    }
                }

                else
                {
                    switch (type)
                    {
                        case 'a': cars[i] = new mobile_car("Electric","Sedan"); break;
                        case 'b': cars[i] = new mobile_car("Electric","Limo"); break;
                        case 'c': cars[i] = new mobile_car("Electric","Hatchback"); break;
                        default: System.out.println("Error. Try again");
                    }
                }
            }

            case 2:
            {

            }

            case 3:
            {

            }
        }
    }
}
