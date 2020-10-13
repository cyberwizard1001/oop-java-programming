/*
1. A class called Book is designed (as shown in the class diagram) to model a book written by one author. It contains:

Four private instance variables: name (String), author (of the class Author you have just created, assume that a book has one and only one author), price (double), and qty (int);

Two constructors:

public Book (String +cd name, Author author, double price) { ...... }

public Book (String name, Author author, double price, int qty) { ...... }

public methods getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().

Test this in main.
 */

import java.util.Scanner;
public class book {

    String name;
    Author author;
    double price;
    int quantity;
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public book(String book_name, Author book_author, double book_price)
    {
        name = book_name;
        author = book_author;
        price = book_price;
    }

    public book(String book_name, Author book_author, int book_qty)
    {
        name = book_name;
        author = book_author;
        quantity = book_qty;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity()
    {
        quantity = input.nextInt();
    }

    public void setPrice()
    {
        price = input.nextDouble();
    }

}
