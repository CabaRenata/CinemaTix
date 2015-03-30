package service.impl;

import dao.EntityJpaDao;
import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * @author Marius
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    /**
     * @param entityJpaDao
     */
    @Autowired
    @Qualifier("userDaoImpl")
    public void setEntityJpaDao(final EntityJpaDao<User> entityJpaDao) {
        this.entityJpaDao = entityJpaDao;
    }

    @Override
    public User getUserByUsername(final String username) {
        return ((UserDao) entityJpaDao).getUserByUsername(username);
    }

    @Override
    public boolean validLogin(final String user, final String pass) {
        boolean valid = false;
        final User u = ((UserDao) entityJpaDao).getUserByUsername(user);
        if (u != null) {
            final String correctPassword = u.getPassword();
            if (pass.equals(correctPassword)) {
                valid = true;
            }
        }
        return valid;
    }
}
