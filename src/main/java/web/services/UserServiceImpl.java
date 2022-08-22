package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDAO;

    @Autowired
    public UserServiceImpl(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> showAllUsers() {
        return userDAO.showAllUsers();
    }
    @Override
    public User showUser(int id) {
        return userDAO.showUser(id);
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Transactional
    @Override
    public void updateUser(int id, User updatedUser) {
        userDAO.updateUser(id, updatedUser);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
