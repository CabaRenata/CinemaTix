package service;

import model.User;

/**
 * Created by cabar on 3/30/2015.
 */
public interface UserService<T extends BaseService<User>> {

    User getUserByUsername(String username);

    /**
     * @param user
     * @param pass
     * @return true/false
     */
    public boolean validLogin(String user, String pass);
}
