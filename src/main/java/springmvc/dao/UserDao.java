package springmvc.dao;

import springmvc.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getUsers();
}
