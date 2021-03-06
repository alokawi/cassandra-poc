/**
 * 
 */
package alokawi.poc.core;

import alokawi.poc.exception.QueryBuilderException;

/**
 * @author alokkumar
 *
 */
public interface QueryBuilder<C> {

	public Query<C> build(C context) throws QueryBuilderException;

}
