/*

public Book (String +cd name, Author author, double price) { ...... }

public Book (String name, Author author, double price, int qty) { ...... }

public methods getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().

Test this in main.
 */

import java.util.Scanner;

public class book_main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Adding author: ");

        System.out.print("Enter name: ");
        String a_name = input.nextLine();
        System.out.print("Enter gender in single character");
        char gender = input.next().charAt(0);
        System.out.print("Age: ");
        int age = input.nextInt();
        Author author = new Author(a_name,gender,age);

        System.out.println("\nBook 1");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price");
        double price = input.nextDouble();

        book book1 = new book(name,author,price);

        System.out.println("\nBook 2");
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Price");
        double price2 = input.nextDouble();
        System.out.print("Quantity: ");
        int qty = input.nextInt();

        book book2 = new book(name2,author,price2,qty);

        System.out.print("Book 1: ");
        System.out.println("Name: "+book1.getName());
        System.out.println("Author: "+book1.getAuthor());
        System.out.print("Quantity: "+book1.getQuantity());

        System.out.print("Book 2: ");
        System.out.println("Name: "+book2.getName());
        System.out.println("Author: "+book2.getAuthor());
        System.out.print("Quantity: "+book2.getQuantity());

    }
}
