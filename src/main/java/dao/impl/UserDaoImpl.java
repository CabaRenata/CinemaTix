package dao.impl;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * @author Marius
 */
@Repository
public class UserDaoImpl extends EntityJpaDaoImpl<User> implements UserDao {

    /**
     * Constructor.
     */
    public UserDaoImpl() {
        setClazz(User.class);
    }

    @Override
    public User getUserByUsername(final String username) {
        try {
            final Query q = super.entityManager.createQuery("FROM " + clazz.getName()
                    + " WHERE username = '" + username + "'");
            final User result = (User) q.getSingleResult();
            return result;
        }
        catch (final NoResultException e) {
            return null;
        }
    }

}
