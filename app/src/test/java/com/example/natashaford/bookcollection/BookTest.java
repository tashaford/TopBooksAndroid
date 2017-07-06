package com.example.natashaford.bookcollection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 05/07/2017.
 */

public class BookTest {


    Book book;

    @Before
    public void before() {
        book = new Book(2, "Harry Potter and the Deathly Hallows", "J.K. Rowling", 2007, R.drawable.book2);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)2, book.getRanking());
    }

    @Test
    public void getTitleTest() {
        assertEquals("Harry Potter and the Deathly Hallows", book.getTitle());
    }

    @Test
    public void getAuthorTest() {
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)2007, book.getYear());
    }
}
