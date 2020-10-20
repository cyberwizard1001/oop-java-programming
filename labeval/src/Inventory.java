/*
Write a program to create a class Inventory for an inventory report.
The class Inventory contains the item_name, ItemID, price, stock, reorder_point, minimum_order and order_amount.

The order_amount is to be calculated when the stock falls below the reorder_point. It is calculated as the

reorder_point + minimum_order - stock + 1

such that (reorder_point + minimum_order) is strictly less than stock

Write a Java program with the following functionalities: -

A class to store the details of item, with A parameterized constructor for initializing the attributes. Create an array of objects.
A class method to search an item by its Name and check whether it needs ordering.
A method to calculate the order_amount for all items, where stock is less.
For items that does not require ordering, order_amount is set to 0.
Print a neat report on the items that requires replenishing stock with item_name and order_amount .
If no item requires replenishing, this method prints the message "All items are available".

 */



import java.util.Scanner;

public class Inventory {
    String item_name;
    String ItemID;
    int price;
    int stock;
    int reorder_point;
    int minimum_order;
    int order_amount;
    static int found = 0;

    Inventory(String name, String ID, int item_price, int item_stock, int reorder, int min_order)
    {
        item_name = name;
        ItemID = ID;
        price = item_price;
        stock = item_stock;
        reorder_point = reorder;
        minimum_order = min_order;
    }

    public void nameSearch()
    {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String key = input.nextLine();

        if(item_name.equals(key))
        {
            found = 1;
            if(stock<reorder_point)
            {
                order_amount = reorder_point+minimum_order-stock+1;
            }
        }
    }

    public void printStock()
    {
        System.out.println(item_name);
        System.out.println(order_amount);

    }

}
