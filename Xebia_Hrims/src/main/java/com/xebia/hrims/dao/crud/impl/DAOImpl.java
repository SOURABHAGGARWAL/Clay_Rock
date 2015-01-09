package com.xebia.hrims.dao.crud.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.xebia.hrims.dao.crud.IDAO;
import com.xebia.hrims.exception.HrimsException;

@Transactional
@SuppressWarnings("unchecked")
public abstract class DAOImpl<T extends Serializable> implements IDAO<T>
{
	
	private Class<T> clazz;
	
	/**
	 * @return the clazz
	 */
	public Class<T> getClazz() {
		return clazz;
	}
	
	@Autowired
	protected SessionFactory sessionFactory;

	/**
	 * @param clazz
	 *            the clazz to set
	 */
	public DAOImpl(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public void create(T instance) {
		Preconditions.checkNotNull(instance, "instance is null!");
		sessionFactory.getCurrentSession().save(instance);
	}

	@Override
	public void update(T instance) {
		Preconditions.checkNotNull(instance, "instance is null!");
		sessionFactory.getCurrentSession().update(instance);
	}

	@Override
	public void delete(T instance) {
		Preconditions.checkNotNull(instance, "instance is null!");
		sessionFactory.getCurrentSession().delete(instance);
	}

	@Override
	public T findById(Serializable id) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(clazz);
		return criteria.list();
	}

	@Override
	public List<T> findByCriteria(Criterion criterion) {
		return findByCriteria(criterion, null);
	}

	@Override
	public List<T> findByCriteria(Criterion criterion, Order[] orders) {
		Preconditions.checkNotNull(criterion, "criterion is null!");

		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(clazz);

		criteria.add(criterion);

		if (orders != null)
			for (Order order : orders)
				criteria.addOrder(order);

		return criteria.list();
	}
}
