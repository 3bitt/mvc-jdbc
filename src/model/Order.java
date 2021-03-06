package model;

public class Order extends Model {
	
	private Integer id;
	private Integer CompanyID;
	private String description;
	private Integer quantity;
	private float price;
	
	

	public Order(Integer CompanyID, String description, Integer quantity, float price) {
		this.CompanyID = CompanyID;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Order(Integer id, Integer CompanyID, String description, Integer quantity, float price) {
		this.id = id;
		this.CompanyID = CompanyID;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(Integer companyID) {
		CompanyID = companyID;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
