package com.xebia.hrims.dao.crud;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

public interface IDAO<T extends Serializable>
{
	 /**
     * Saves instance to database
     * @param instance The instance
     */
    public void create(T instance);

    /**
     * Updates instance in database
     * @param instance The instance
     */
    public void update(T instance);

    /**
     * Deletes instance from database
     * @param instance The instance
     */
    public void delete(T instance);

    /**
     * Find instance for given id in database
     * @param id The unique key for the record
     */
    public T findById(Serializable id);

    /**
     * @return All the records from database
     */
    public List<T> findAll();

    /**
     * Fetch all records matching the complex criteria.<br>
     * Like to use condition :
     * <code>
     * (a == 1) && (b != 2)<br><br>
     * Criterion c1 = Restrictions.eq("a", "1");<br>
     * Criterion c2 = Restrictions.ne("b", "2");<br><br>
     * Criterion c = Restrictions.and(c1, c2);<br><br>
     * </code>
     * So <code>c</code> will be used to call this function.
     * 
     * @param criterion {@link Criterion} object for filtering
     * @return All the records from database matching criteria
     */
    public List<T> findByCriteria(Criterion criterion);

    /**
     * @param criterion {@link Criterion} object for filtering
     * @param orders The array of order clauses
     * @return All the records from database matching criteria in given order
     */
    public List<T> findByCriteria(Criterion criterion, Order []orders);
}
