package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> userList = new ArrayList<>();


    public Forum() {
        userList.add(new ForumUser(001, "aaa", 'M', LocalDate.of(1901, 1, 1), 1));
        userList.add(new ForumUser(002, "bbb", 'F', LocalDate.of(1992, 2, 2), 2));
        userList.add(new ForumUser(003, "ccc", 'M', LocalDate.of(2003, 3, 3), 3));
        userList.add(new ForumUser(004, "ddd", 'F', LocalDate.of(2004, 4, 4), 4));
        userList.add(new ForumUser(005, "eee", 'M', LocalDate.of(2005, 5, 5), 5));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
