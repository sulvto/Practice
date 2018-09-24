package me.qinchao.web.service;

import me.qinchao.web.domain.User;
import me.qinchao.web.exception.UserNotFoundException;

/**
 * Created by sulvto on 9/21/18.
 */
public interface UserService {

    /**
     * Adds a new user entry.
     *
     * @param added The information of the added user entry.
     * @return The added user entry.
     */
    public User add(User added);

    /**
     * Returns a list of user entries.
     *
     * @return
     */
    public Iterable<User> findAll();

    /**
     * Deletes a user entry.
     *
     * @param id The id of the deleted user entry.
     * @return The deleted user entry.
     * @throws UserNotFoundException if no user entry is found with thr given id.
     */
    public User deleteById(Long id) throws UserNotFoundException;

    /**
     * Finds a user entry.
     *
     * @param id The id of the wanted user entry.
     * @return The found user entry.
     * @throws UserNotFoundException if no user entry is found with thr given id.
     */
    public User findById(Long id) throws UserNotFoundException;

    /**
     * Updates the information of a user entry.
     *
     * @param updated The information of the updated user entry.
     * @return The updated user entry.
     * @throws UserNotFoundException if no user entry is found with thr given id.
     */
    public User update(User updated) throws UserNotFoundException;
}
