import java.util.Scanner;
/*

 */
public class InventoryMain {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Scanner input2 = new Scanner(System.in);

        int times = input2.nextInt();

        Inventory[] array = new Inventory[times];

        for(int i=0;i<times;i++)
        {
            String name = input.nextLine();
            String ID = input.nextLine();
            int price = input2.nextInt();
            int stock = input2.nextInt();
            int reorder_point = input2.nextInt();
            int min_order = input2.nextInt();

            array[i] = new Inventory(name,ID,price,stock,reorder_point,min_order);
        }

        for(int i=0;i<times;i++)
        {
            check(array[i]);

            if(array[i].order_amount>0)
                array[i].printStock();
        }




    }

    public static void check(Inventory item)
    {
        if(item.stock<item.reorder_point)
            item.order_amount = item.reorder_point+item.minimum_order-item.stock+1;

        else item.order_amount = 0;
    }
}
