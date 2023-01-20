package com.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.test.exception.GlobalException;

public class ProductService {
	 ArrayList<Product> product=new ArrayList<Product>();
	ArrayList <OrderDetails> orders = new ArrayList <OrderDetails>();
	 Scanner sc=new Scanner(System.in);

	 void addProduct(int id,String name,String brand,double price,int stock)
	{
		product.add(new Product(id, name, brand, price, stock));
		System.out.println("Product details added successfully!!");
		
	}

	 
	 public Product findById(int id)
	 { 
		 Product p=null;
		 for(int i=0;i<product.size();i++)
		 {
			 if(product.get(i).getId()==id)
			 {
				 p=product.get(i);
			 }
		 }
		 return p;
	 }
	 
	 
	 Product updateProduct(int index,Product p) throws GlobalException
	{	
		      return product.set(index, p);
		
		}
		
		
	 Product getProductById(int id)throws GlobalException
	{
		
		
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				return product.get(i);
			}
			else
			 throw new GlobalException("Product id not found!!!");
	}
		return null;
	}
	 
	 public Product deleteById(int id)
	 { 
		 Product a=null;
		 for(int i=0;i<product.size();i++)
		 {
			 if(product.get(i).getId()==id)
			 {
				 a=product.remove(i);
			 }
		 }
		 return a;
	 }
	 Product deleteProductById(int id)throws GlobalException
	{
		
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				Product removeProduct=product.remove(i);
				return removeProduct;
			}
			else
				 throw new GlobalException("Product id not found!!!");	
			}
		return null;
	}
	
	 String deleteAllProduct()
	 {
		 product.clear();
		 return "All product deleted successfully";
	 }
	 
	 int lengthOfList()
	{
		return product.size();
	}
	 
	 Product cancelOrderById(int Id) throws GlobalException
	 {
	 
	 	for(int i = 0;i<product.size();i++)
	 	{
	 		if(Id == product.get(i).getId())
	 		{
	 			Product cancel = product.remove(i);
	 			return cancel;
	 		}
	 		else
	 			
	 		throw new GlobalException("No such Id related product can be found!");
	 	}
	 	return null;
	 	
	 		
	 }
	
	
}

