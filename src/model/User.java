package model;

import utils.MyArrayList;
import utils.MyList;

public class User {

    private String name;
    private int age;
    private Role role;

    private final MyList<GameDetails> userGames;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.role = Role.USER;
        this.userGames = new MyArrayList<>();
    }
}
