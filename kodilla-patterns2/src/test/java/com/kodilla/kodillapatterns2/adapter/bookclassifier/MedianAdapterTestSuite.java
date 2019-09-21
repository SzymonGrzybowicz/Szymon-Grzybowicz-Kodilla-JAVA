package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        for (int i = 0; i < 10; i++){
            bookSet.add(new Book(
                    "Author " + i,
                    "Title " + i,
                    2000 + (i *2),
                    "Signature: " + i
            ));
        }
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2010, result);


    }
}
