package br.com.erudio.repository.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class GenericRepository<T> implements IGenericRepository<T>, Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(GenericRepository.class);

    @PersistenceContext
    protected EntityManager entityManager;
    private Class<T> clazz;
    
    public GenericRepository() { }

    public GenericRepository(Class<T> clazz) {
        this.clazz = clazz;
    }

	@Override
	@Transactional
	public T create(T entity) {
		try {
			logger.info("Creating an entity");
			entity = entityManager.merge(entity);
		} catch (Exception e) {
			logger.error(e);
		}
		return entity;
	}

	@Override
	@Transactional
	public T update(T entity) {
		try {
			logger.info("Updating an entity");
			entity = entityManager.merge(entity);
		} catch (Exception e) {
			logger.error(e);
		}
		return entity;
	}

	@Override
	@Transactional
	public void delete(T entity) {
		try {
			logger.info("Deleting an entity");
			entityManager.remove(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
	}
	
	@Override
	public T findById(String id) {
        try {
        	logger.info("Finding an entity by ID");
	        T entity = (T)entityManager.find(clazz, Long.parseLong(id));
			return entity;
		} catch (Exception e) {
			logger.error(e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		ArrayList<T> entities = new ArrayList<>();
		try {
			logger.info("Finding all entities");
			Query query = entityManager.createQuery("from " + clazz.getName());
			entities = (ArrayList<T>) query.getResultList();
		} catch (Exception e) {
			logger.error(e);
		}
		return entities;
	}
}