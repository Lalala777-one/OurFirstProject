package repository;

import model.User;

public interface UserRepository {

    User addUser(String email, String password);



    boolean isEmailExists(String Email);

    User getUserByEmail(String email);
}
