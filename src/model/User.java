package model;

import utils.MyArrayList;
import utils.MyList;

public class User {

    private String name;
    private int age;
    private Role role;
    private String email;
    private String password;

    private final MyList<GameDetails> userGames;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = Role.USER;
        this.userGames = new MyArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }


    public MyList<GameDetails> getUserGames() {
        return userGames;
    }
}
