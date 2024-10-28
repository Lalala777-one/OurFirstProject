package repository;

import model.User;
import utils.MyArrayList;
import utils.MyList;



public class UserRepositoryImpl implements UserRepository{

    private final MyList<User> users;

    public UserRepositoryImpl(MyList<User> users) {
        this.users = users;
    }

    @Override
    public User addUser(String email, String password) {
        User user = new User(email, password);
        users.add(user);
        return user;
    }

    @Override
    public boolean isEmailExists(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return true; //  найден
            }
        }
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user : users){
            if(user.getEmail().equalsIgnoreCase(email)){
                return user; // если есть такой
            }
        }
        return null;
    }
}
