package service;

import model.BaseEntity;

import java.util.List;

/**
 * Created by cabar on 3/30/2015.
 */
public interface BaseService<T extends BaseEntity> {
    /**
     * @param id
     * @return T
     */
    T findOne(final Long id);

    /**
     * @return list<T>
     */
    List<T> findAll();

    /**
     * @param entity
     * @return T
     */
    Long save(T entity);

    /**
     * @param entity
     */
    void update(T entity);

    /**
     * @param entityID
     */
    void updateById(Long entityID);

    /**
     * @param entity
     */
    void delete(T entity);

    /**
     * @param entityId
     */
    void deleteById(Long entityId);
}
