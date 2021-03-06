package interfejs;

import java.util.List;

import model.Company;
import model.Model;
import model.Order;

public interface DAOInterf {

	public List<Company> getCompanies();	
	public List<Order> getAllOrders();
	public List<Order> getSpecOrders(int companyID);

	public void insertObject(Model model);
	public void updateObject(Model model);
	
	public void deleteOrder(int id);
	public void deleteCompany(int id);

	
	//TODO Not implemented methods
	public void createTableCompany();
	public void createTableOrder();

}
