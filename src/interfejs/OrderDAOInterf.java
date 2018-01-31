package interfejs;

import java.util.List;

import model.Order;

public interface OrderDAOInterf {

		public int createOrder(Order order);
	
		public void createTableOrder();
	    
	    public List<Order> getSpecOrders(int companyID);

	    public List<Order> getAllOrders();
	 
	    public int updateOrder(Order order);
	 
	    public void deleteOrder(int id);

}
