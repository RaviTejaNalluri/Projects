package DataAccess;

import java.util.List;

import com.google.appengine.api.datastore.Key;

/**
 * Interface for persisting entity objects to a datastore
 * @param <AnyType>	Entity of the object that will be persisted to the repository
 */
public interface IRepository<AnyType> {
	public AnyType get(Key key);
	public List<AnyType> getAll();
	public List<AnyType> getFiltered(String filter);
	public void insert(AnyType entity);
	public void update(AnyType entity, Key key);
	public void delete(Key key);
}