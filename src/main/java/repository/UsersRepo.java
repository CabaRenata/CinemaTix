package repository;

import domain.Room;
import domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the repository for User class.
 */
public class UsersRepo {
    private List<User> users;

    /**
     * Constructor which will create a repository based on a list of users.
     * @param users - list of users which will be added to repository.
     */
    public UsersRepo(List<User> users) {
        this.users = users;
    }

    /**
     * Constructor which will create an empty repository.
     */
    public UsersRepo() {
        this.users =  new ArrayList<User>();
    }

    /**
     * This mehod will add a given user into repository.
     * @param user - user which will be added.
     */
    public void addUser(User user){
        this.users.add(user);
    }

    /**
     * This method will create a new user based on the provided information and will add it into repository.
     * @param userId - Integer, new user's id
     * @param username - String, new user's username
     * @param password - String - new user's password
     * @param firstName - String - new user's first name
     * @param lastName - String - new user's last name
     * @param emailAddress - String - new user's email address
     * @param telephoneNumber - String - new user's telephone number.
     */
    public void addUser(Integer userId, String username, String password, String firstName, String lastName, String emailAddress, String telephoneNumber){
        User newUser = new User(userId, username, password, firstName, lastName, emailAddress, telephoneNumber);
        this.addUser(newUser);
    }

    /**
     * This method will remove a user from repository based on his id.
     * @param id - Integer, id of the user which will be deleted.
     */
    public void removeUserBasedOnId(Integer id){
        Integer index=-1;
        for(User user : users){
            if(user.getUserId() == id){
                index = users.indexOf(user);
            }
        }
        if(index!=-1){
            users.remove(index);
        }
    }

    /**
     * This method will remove a user from repository based on his first and last name.
     * @param firstName - String, first name of the user which will be deleted.
     * @param lastName - String, last name of the user which will be deleted.
     */
    public void removeUserBasedOnFirstAndLastName(String firstName, String lastName){
        Integer index=-1;
        for(User user : users){
            if(user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)){
                index = users.indexOf(user);
            }
        }
        if(index!=-1){
            users.remove(index);
        }
    }

    /**
     * This method will remove a user from repository based on his username.
     * @param username - String, username name of the user which will be deleted.
     */
    public void removeUserBasedOnUsername(String username){
        Integer index=-1;
        for(User user : users){
            if(user.getUsername().equals(username)){
                index = users.indexOf(user);
            }
        }
        if(index!=-1){
            users.remove(index);
        }
    }

    /**
     * This method will return a user based on his userId.
     * @param id - Integer, user's id
     * @return the user with the given id
     */
    public User getUserBasedOnId(Integer id){
        for (User user: users){
            if (user.getUserId() == id){
                return user;
            }
        }
        return  null;
    }

    /**
     * This method will return a user based on his username.
     * @param username - String, user's username
     * @return the user with the given username
     */
    public User getUserBasedOnUsername(String username){
        for (User user: users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return  null;
    }

    /**
     * This method will return a user based on his first and last name.
     * @param firstName - String, user's first name
     * @param lastName - String, user's last name
     * @return the user with the given first and last name
     */
    public User getUserBasedOnName(String firstName, String lastName){
        for (User user: users){
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)){
                return user;
            }
        }
        return  null;
    }

}
