package me.qinchao.web.service.impl;

import me.qinchao.web.exception.EntryNotFoundException;
import me.qinchao.web.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

/**
 * Created by sulvto on 9/21/18.
 */
public class RepositoryBaseService<T> implements BaseService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryBaseService.class);

    private JpaRepository<T, Long> repository;

    // T class simple name
    private final String entryName;

    RepositoryBaseService(JpaRepository repository) {
        this.repository = repository;
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        String entryFullName = parameterizedType.getActualTypeArguments()[0].getTypeName();
        entryName = entryFullName.substring(entryFullName.lastIndexOf(".") + 1);
        LOGGER.debug("Init RepositoryBaseService, entry name: {}", entryName);
    }

    @Override
    public T add(T added) {
        LOGGER.debug("Adding a new `{}` entry with information: {}", added.getClass().getSimpleName(), added);

        return repository.save(added);
    }

    @Override
    public Iterable<T> findAll() {
        LOGGER.debug("Finding all `{}` entries", entryName);
        return repository.findAll();
    }

    @Override
    public T deleteById(Long id) throws EntryNotFoundException {
        LOGGER.debug("Deleting a `{}` entry with id: {}", entryName, id);
        T deleted = findById(id);
        LOGGER.debug("Deleting `{}` entry: {}", entryName, deleted);
        repository.delete(deleted);
        return deleted;
    }

    @Override
    public T findById(Long id) throws EntryNotFoundException {
        LOGGER.debug("Finding a `{}` entry with id: {}", entryName, id);
        Optional<T> modelOptional = repository.findById(id);
        if (modelOptional.isPresent()) {
            T model = modelOptional.get();
            LOGGER.debug("Found `{}` entry: {}", entryName, model);
            return model;
        } else {
            throw new EntryNotFoundException("No `" + entryName + "` entry found with id: " + id);
        }
    }

    @Override
    public T update(T updated, Long id) throws EntryNotFoundException {
        LOGGER.debug("Updating contact with information: {}", updated);
        T model = findById(id);
        LOGGER.debug("Updating a `{}` entry: {}", model);
        repository.save(updated);
        return model;
    }
}
