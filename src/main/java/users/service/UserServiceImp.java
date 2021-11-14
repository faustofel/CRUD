package users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import users.DAO.UserDAO;
import users.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void editUser(User user) {
        userDAO.editUser(user);
    }

    @Override
    public void removeUserById(long id) {
        userDAO.removeUserById(id);
    }
}
