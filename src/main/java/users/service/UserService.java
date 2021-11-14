package users.service;

import users.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(long id);
    public void addUser(User user);
    public void editUser(User user);
    public void removeUserById(long id);

}
