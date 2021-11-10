package apc.entjava.hssportscatalogejb;

import java.util.List;

import javax.ejb.Local;

@Local
public interface CatalogLocal {

	public List<CatalogItem> getItems();
	
	public void addItem(CatalogItem item);

	public void deleteItem(CatalogItem item);

	public void updateItem(CatalogItem item);

	CatalogItem findItem(Long itemId);

	public List<CatalogItem> searchByName(String name);

}
