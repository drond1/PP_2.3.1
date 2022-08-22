package web.dao;
import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();
    User showUser(int id);
    void saveUser(User user);
    void updateUser(int id, User updatedUser);
    void deleteUser(int id);
}
