package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("1");
        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean up
        invoiceDao.deleteById(id);
    }

    @Test
    public void testProductDaoSave(){
        Product product = new Product("name");
        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));

        item1.setProduct(product);
        item2.setProduct(product);

        product.getItems().add(item1);
        product.getItems().add(item2);

        //When
        productDao.save(product);
        int id = product.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean up
        //productDao.deleteById(id);


    }
}

