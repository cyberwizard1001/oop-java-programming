import java.util.Scanner;

public class Three_Main {

    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int n;
        System.out.print("Enter integer:" );
        n = input.nextInt();

        if(n==1)
        {
            Vehicle obj = new Bike();
            obj.display();
        }

        else if(n==2)
        {
            Vehicle obj = new Car();
            obj.display();
        }

        else
        {
            Vehicle obj = new Vehicle();
            obj.display();
        }
    }
}
