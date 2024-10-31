package pack1;

public class Product 
{
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId,String productName,double price,int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;	
		
	}
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public String toString()
	{
		return productId+","+productName+" "+price+","+quantity;
	}

}
