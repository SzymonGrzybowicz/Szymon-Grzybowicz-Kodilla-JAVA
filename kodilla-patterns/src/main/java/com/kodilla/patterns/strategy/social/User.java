package com.kodilla.patterns.strategy.social;

public class User {

    private final String userName;
    private SocialPublisher prefferedSocialMedia;

    public User(String userName, SocialPublisher prefferedSocialMedia) {
        this.userName = userName;
        this.prefferedSocialMedia = prefferedSocialMedia;
    }

    public void sharePost() {
        System.out.println("User " + userName + " shared post on: " );
        prefferedSocialMedia.share();
    }

    public void setPrefferedSocialMedia(SocialPublisher prefferedSocialMedia) {
        this.prefferedSocialMedia = prefferedSocialMedia;
    }

    public SocialPublisher getPrefferedSocialMedia() {
        return prefferedSocialMedia;
    }

}
