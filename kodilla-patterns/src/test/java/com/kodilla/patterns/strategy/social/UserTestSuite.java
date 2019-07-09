package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User milenialUser = new Millenials("Milenial");
        User yGenerationUser = new YGeneration("YGeneration");
        User zGenerationUser = new ZGeneration("ZGeneration");

        //When
        //Then
        Assert.assertEquals(SnapchatPublisher.class, milenialUser.getPrefferedSocialMedia().getClass());
        Assert.assertEquals(TwitterPublisher.class, yGenerationUser.getPrefferedSocialMedia().getClass());
        Assert.assertEquals(FacebookPublisher.class, zGenerationUser.getPrefferedSocialMedia().getClass());
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User milenialUser = new Millenials("Milenial");

        //When
        milenialUser.setPrefferedSocialMedia(new FacebookPublisher());

        //Then
        Assert.assertEquals(FacebookPublisher.class, milenialUser.getPrefferedSocialMedia().getClass());
    }
}
