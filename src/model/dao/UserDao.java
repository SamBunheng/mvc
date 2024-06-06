package model.dao;

import java.util.List;
import model.User;

public interface UserDao {
    void addNewUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
    List<User> getAllUser();
}
