package com.example.natashaford.bookcollection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 05/07/2017.
 */

public class BookListTest {


    @Test
    public void getListTest() {
        BookList bookList = new BookList();
        assertEquals(20, bookList.getList().size());
    }
}
