/**
 * Definition for common methods for all entities.
 */
package dao;

import model.BaseEntity;

import java.util.List;

/**
 * @author Marius
 * @param <T>
 */
public interface EntityJpaDao<T extends BaseEntity> {

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
