package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testStandardBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBulider().getStandardBigMac();

        //When

        //Then
        Assert.assertEquals("Classic Bun", bigMac.getBun());
        Assert.assertEquals(1, bigMac.getBurgers());
        Assert.assertEquals("Standard Sauce", bigMac.getSauce());
        Assert.assertEquals(1, bigMac.getIngredients().size());
        Assert.assertEquals("Cheese", bigMac.getIngredients().get(0));
    }

    @Test
    public void testBigMacBuilder(){
        //Given
        BigMac bigMac = new BigMac.BigMacBulider()
                .bun(BigMac.WHOLEMEAL_BUN)
                .sauce(BigMac.BARBECUE_SAUCE)
                .burgers(3)
                .ingredient(BigMac.BACON)
                .ingredient(BigMac.CHEESE)
                .ingredient(BigMac.CHILLI)
                .build();

        //When

        //Then
        Assert.assertEquals("Wholemeal Bun", bigMac.getBun());
        Assert.assertEquals("Barbecue Sauce", bigMac.getSauce());
        Assert.assertEquals(3, bigMac.getBurgers());
        Assert.assertEquals(3, bigMac.getIngredients().size());
        Assert.assertEquals("Bacon", bigMac.getIngredients().get(0));
        Assert.assertEquals("Cheese", bigMac.getIngredients().get(1));
        Assert.assertEquals("Chili", bigMac.getIngredients().get(2));
    }
}
