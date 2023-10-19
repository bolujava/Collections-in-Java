package org.example.list;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();

        Book b1 = new Book("Wole Soyinka", 1, "Bacchae", 23);
        Book b2 = new Book("Chinua Achebe", 2, "Big Wiz", 50);
        Book b3 = new Book("Chika Ike ", 3, "The Holiday", 70);

        book.add(b1);
        book.add(b2);
        book.add(b3);
        for (Book b: book){
            System.out.println(b.id+ " " +b.name+ " " +b.author+ " " +b.quantity);

        }

    }

}

class Book {

    String author;
    int id;
    String name;
    int quantity;


    public Book(String author, int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }
}


