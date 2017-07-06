package com.example.natashaford.bookcollection;

import java.util.ArrayList;

/**
 * Created by natashaford on 05/07/2017.
 */

public class BookList {


    private ArrayList<Book> list;

    public BookList() {
        list = new ArrayList<Book>();
        list.add(new Book(1, "To Kill a Mockingbird", "Harper Lee", 1960, R.drawable.book1));
        list.add(new Book(2, "Harry Potter and the Deathly Hallows", "J.K. Rowling", 2007, R.drawable.book2));
        list.add(new Book(3, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, R.drawable.book3));
        list.add(new Book(4, "The Hunger Games", "Suzanne Collins", 2008, R.drawable.book4));
        list.add(new Book(5, "1984", "George Orwell", 1949, R.drawable.book5));
        list.add(new Book(6, "The Kite Runner", "Khaled Hosseini", 2003, R.drawable.book6));
        list.add(new Book(7, "The Stand", "Stephen King", 1978, R.drawable.book7));
        list.add(new Book(8, "The Book Thief", "Markus Zusak", 2005, R.drawable.book8));
        list.add(new Book(9, "Pride and Prejudice", "Jane Austen", 1813, R.drawable.book9));
        list.add(new Book(10, "The Hobbit", "J.R.R. Tolkien", 1937, R.drawable.book10));
        list.add(new Book(11, "A Game of Thrones: A Song of Ice and Fire ", "George R.R. Martin", 1996, R.drawable.book11));
        list.add(new Book(12, "Ender's Game", "Orson Scott Card", 1985, R.drawable.book12));
        list.add(new Book(13, "The Help", "Kathryn Stockett", 20013, R.drawable.book13));
        list.add(new Book(14, "Animal Farm", "George Orwell", 1945, R.drawable.book14));
        list.add(new Book(15, "The Fellowship of the Ring: The Lord of the Rings", "J.R.R. Tolkien", 1954, R.drawable.book15));
        list.add(new Book(16, "Wonder", "R.J. Palacio", 2012, R.drawable.book16));
        list.add(new Book(17, "Looking for Alaska", "John Green", 2005, R.drawable.book17));
        list.add(new Book(18, "The House of Hades: The Heroes of Olympus ", "Rick Riordan", 2013, R.drawable.book18));
        list.add(new Book(19, "This is Not My Hat: Hat Trilogy #2", "Jon Klassen", 2012, R.drawable.book19));
        list.add(new Book(20, "Don Quixote", "Miguel de Cervantes Saavedra", 1605, R.drawable.book20));
    }

    public ArrayList<Book> getList() {
        return new ArrayList<Book>(list);
    }

}
