package dao;


import model.User;

/**
 * @author Marius
 */
public interface UserDao extends EntityJpaDao<User> {
    /**
     * @param username
     * @return user
     */
    public User getUserByUsername(String username);
}
