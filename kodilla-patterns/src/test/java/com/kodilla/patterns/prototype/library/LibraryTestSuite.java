package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library libraryOne = new Library("Library1");

        for (int i = 1; i < 6; i++) {
            libraryOne.getBooks().add(new Book("book" + i, "author" + i, LocalDate.of(2000 + i, i , i)));
        }


        Library libraryTwo = null;
        Library libraryThree = null;
        try {
            libraryTwo = libraryOne.shallowCopy();
            libraryTwo.setName("Library2");
            libraryThree = libraryOne.deepCopy();
            libraryThree.setName("Library3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        //When&Then
        Assert.assertEquals(5, libraryOne.getBooks().size());
        Assert.assertEquals(5, libraryTwo.getBooks().size());
        Assert.assertEquals(5, libraryThree.getBooks().size());

        libraryThree.getBooks().clear();

        Assert.assertEquals(5, libraryOne.getBooks().size());
        Assert.assertEquals(0, libraryThree.getBooks().size());


        libraryTwo.getBooks().clear();

        Assert.assertEquals(0, libraryOne.getBooks().size());
        Assert.assertEquals(0,libraryTwo.getBooks().size());


    }
}
