package com.book;
import java.util.List;
import java.util.Scanner;

import com.book.dao.bookDaoimp;
import com.book.pojo.book;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        bookDaoimp book = new bookDaoimp();

        int ch;

        do {

            System.out.println("**** Book Management System ****");
            System.out.println("1. Add book");
            System.out.println("2. Read All books");
            System.out.println("3. Update book Details");
            System.out.println("4. Delete book");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            ch = sc.nextInt();

            switch (ch) {


            case 1:

                System.out.println("Enter book Name:");
                String name = sc.next();

                System.out.println("Enter Author Name:");
                String author = sc.next();

                System.out.println("Enter book Price:");
                double price = sc.nextDouble();

                System.out.println("Enter book Quantity:");
                int quantity = sc.nextInt();

                System.out.println("Enter book Category:");
                String category = sc.next();

                book item = new book(name, author, price, quantity, category);
                System.out.println("---------------------------------------");
                book.addbook(item);

                System.out.println("Total="+ quantity*price);
                System.out.println("---------------------------------------");
                break;



            case 2:

                List<book> books = book.getAllBook();

                for (book b : books) {

                    System.out.println(b);

                }

                break;



            case 3:

                System.out.println("Enter book Id:");
                int id = sc.nextInt();

                System.out.println("Enter new book Name:");
                String uname = sc.next();

                System.out.println("Enter new Author Name:");
                String uauthor = sc.next();

                System.out.println("Enter new Price:");
                double uprice = sc.nextDouble();

                System.out.println("Enter new Quantity:");
                int uquantity = sc.nextInt();

                System.out.println("Enter new Category:");
                String ucategory = sc.next();

                book updatedBook =
                        new book(id, uname, uauthor, uprice, uquantity, ucategory);
                System.out.println("---------------------------------------");
                book.updateBook(updatedBook);

                System.out.println("Total="+ uquantity*uprice);
                System.out.println("---------------------------------------");
                break;



            case 4:

                System.out.println("Enter Book Id which you want to delete:");

                int deletedId = sc.nextInt();

                book.deleteBook(deletedId);

                break;



            case 5:

                System.out.println("Exit");

                break;


            default:

                System.out.println("Wrong choice.........");
            }

        } while (ch != 5);

    }
}
