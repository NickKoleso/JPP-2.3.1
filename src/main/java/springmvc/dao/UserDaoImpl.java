package springmvc.dao;

import org.springframework.stereotype.Repository;
import springmvc.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
