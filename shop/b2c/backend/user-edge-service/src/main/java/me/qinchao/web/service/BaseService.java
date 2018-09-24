package me.qinchao.web.service;

import me.qinchao.web.exception.EntryNotFoundException;

/**
 * Created by sulvto on 9/21/18.
 */
public interface BaseService<T> {

    /**
     * Adds a new T entry.
     *
     * @param added The information of the added T entry.
     * @return The added T entry.
     */
    public T add(T added);

    /**
     * Returns a list of T entries.
     *
     * @return
     */
    public Iterable<T> findAll();

    /**
     * Deletes a T entry.
     *
     * @param id The id of the deleted T entry.
     * @return The deleted T entry.
     * @throws EntryNotFoundException if no T entry is found with thr given id.
     */
    public T deleteById(Long id) throws EntryNotFoundException;

    /**
     * Finds a T entry.
     *
     * @param id The id of the wanted T entry.
     * @return The found T entry.
     * @throws EntryNotFoundException if no T entry is found with thr given id.
     */
    public T findById(Long id) throws EntryNotFoundException;

    /**
     * Updates the information of a T entry.
     *
     * @param updated The information of the updated T entry.
     * @param id      The id of the wanted T entry.
     * @return The updated T entry.
     * @throws EntryNotFoundException if no T entry is found with thr given id.
     */
    public T update(T updated, Long id) throws EntryNotFoundException;
}
