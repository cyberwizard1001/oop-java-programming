import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class lab1_5 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        /*Product id
        Product Name
        Product Description
        Product Price
        Model No*/

        System.out.print("Enter product ID: ");
        int pid = input.nextInt();

        System.out.print("Enter product name: ");
        String pname = input.next();

        System.out.print("Enter product description: ");
        String pdesc = input.next();

        System.out.print("Enter product price: ");
        double pprice = input.nextDouble();

        System.out.print("Enter model no: ");
        int modelno = input.nextInt();

        System.out.println("Product ID: " + pid);
        System.out.println("Product name: " + pname);
        System.out.println("Product description: " + pdesc);
        System.out.println("Product price: " + pprice);
        System.out.println("Model number: " + modelno);

    }
}
