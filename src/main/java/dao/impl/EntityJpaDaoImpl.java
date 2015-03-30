/**
 * 
 */
package dao.impl;

import dao.EntityJpaDao;
import model.BaseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Marius
 * @param <T>
 */
@Transactional
@Repository
public class EntityJpaDaoImpl<T extends BaseEntity> implements dao.EntityJpaDao<T>{

    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> clazz;

    /**
     * @param clazzToSet
     */
    public void setClazz(final Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    /**
     * @param id
     * @return T
     */
    public T findOne(final Long id) {
        return entityManager.find(clazz, id);
    }

    /**
     * @return list
     */
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        final List<T> resultList = entityManager.createQuery(
                "from " + clazz.getName()).getResultList();
        return resultList;
    }

    @Override
    public Long save(final T entity) {
        entityManager.persist(entity);
        entityManager.flush();
        return 1L;
    }

    @Override
    public void update(final T entity) {
        entityManager.merge(entity);
        entityManager.flush();
    }

    @Override
    public void updateById(final Long entityID) {
        final T entity = findOne(entityID);
        update(entity);
    }

    @Override
    public void delete(final T entity) {
        entityManager.remove(entity);
        entityManager.flush();
    }

    @Override
    public void deleteById(final Long entityId) {
        final T entity = findOne(entityId);
        delete(entity);
    }

}
