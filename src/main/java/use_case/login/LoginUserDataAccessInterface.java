package use_case.login;

import entity.User;

/**
 * Interface for accessing and manipulating login user data.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the current user in the data access object.
     * @param name the username of the user to set as the current user
     */
    void setCurrentUser(String name);

    /**
     * Retrieves the current logged-in user.
     * @return the current user, or null if no user is logged in
     */
    Object getCurrentUser();
}
