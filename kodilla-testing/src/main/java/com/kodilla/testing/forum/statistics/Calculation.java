package com.kodilla.testing.forum.statistics;

public class Calculation {

    int userAmount;
    int postsAmount;
    int commentsAmount;
    double postsAveragePerUser;
    double commentsAveragePerUser;
    double commentsAveragePerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        if (userAmount > 0) {
            postsAveragePerUser = postsAmount / userAmount;
            commentsAveragePerUser = commentsAmount / userAmount;
        }
        if (postsAmount > 0) {
            commentsAveragePerPost = commentsAmount / postsAmount;
        }
    }


}
