package pack1;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductInventory 
{
	
		HashMap<Object,Product> productMap=new HashMap<Object,Product>();
		ArrayList<Product> productList=new ArrayList<Product>();
		
		 public void addProduct(Product product) {
		        productMap.put(product.getProductId(), product);
		        productList.add(product);
		    }

		    public void removeProduct(int productId) {
		        Product product = productMap.remove(productId);
		        if (product != null) {
		            productList.remove(product);
		        }
		    }

		    public void updateProductQuantity(int productId, int newQuantity) {
		        Product product = productMap.get(productId);
		        if (product != null) {
		            product.setQuantity(newQuantity);
		        }
		    }

		
		
	

}
