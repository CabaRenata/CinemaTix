package service.impl;

import java.util.List;

import dao.EntityJpaDao;
import model.BaseEntity;
import org.springframework.transaction.annotation.Transactional;
import service.BaseService;

/**
 * Created by cabar on 3/30/2015.
 */
@Transactional
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    protected EntityJpaDao<T> entityJpaDao;

    @Override
    public T findOne(final Long id) {
        return entityJpaDao.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() {
        return entityJpaDao.findAll();
    }

    @Override
    @Transactional
    public Long save(final T entity) {
        return entityJpaDao.save(entity);
    }

    @Override
    @Transactional
    public void update(final T entity) {
        entityJpaDao.update(entity);
    }

    @Override
    @Transactional
    public void delete(final T entity) {
        entityJpaDao.delete(entity);
    }

    @Override
    @Transactional
    public void deleteById(final Long entityId) {
        entityJpaDao.deleteById(entityId);
    }

    @Override
    public void updateById(final Long entityId) {
        entityJpaDao.updateById(entityId);

    }
}
