package app.dao;

import app.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        Query query = entityManager.createQuery("SELECT User from User");
        query.executeUpdate();
        return query.getResultList();
    }

    @Override
    public void addUser(String name, int age, String city) {
        User user = new User(name,age,city);
        entityManager.persist(user);
    }

    @Override
    public void removeUser(Long id) {

    }
}
