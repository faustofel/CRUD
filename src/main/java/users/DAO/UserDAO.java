package users.DAO;

import users.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public User getUserById(long id);
    public void addUser(User user);
    public void editUser(User user);
    public void removeUserById(long id);

}

