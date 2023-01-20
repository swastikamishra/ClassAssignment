package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.test.exception.GlobalException;

import static org.assertj.core.api.Assertions.assertThat;
class ProductServiceTest {

	static ProductService productService;
	@BeforeAll
	static void init()
	{
		productService=new ProductService();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		productService.addProduct(1, "mobile", "samsung", 35000.0, 10);
		productService.addProduct(2, "fridge", "LG", 45000, 10);
	}

	@AfterAll
     static void tearDown() throws Exception {
		productService=null;
		System.out.println("object gets garbage collected");
	}

	@Test
	void testAddProduct()
	{
		
		//assertEquals(2, productService.lengthOfList() );
		//assertThat(productService.lengthOfList()).isEqualTo(2);
		assertThat(productService.lengthOfList()>0).isTrue();
	}
    
	@Test
	void testDeleteAllProduct()
	{
		assertEquals("All product deleted successfully", productService.deleteAllProduct());
	}
	
	@Test
	void testGetProductById() throws GlobalException
	{
		Product p=productService.getProductById(1);
		assertAll(
				()->assertThat(p.getName()).isEqualTo("mobile"),
				()->assertThat(p.getBrand()).isEqualTo("samsung"),
				()->assertThat(p.getPrice()).isEqualTo(35000.0)
		);
		
	}
	
	//test deleteProductById
		
		@Test
		void testDeleteById() throws GlobalException
		{
			Product removedProduct=productService.deleteProductById(1);
			//assertThat(removedProduct.getId()).isEqualTo(1);
			//assertThat(productService.getProductById(1)).isNull();
			assertThrows(GlobalException.class, 
					()->productService.getProductById(1));
		}
		
		
		@Test
		void testUpdateProduct() throws GlobalException
		{
			Product p=productService.findById(2);
			p.setName("Air condition");
			//productService.findById(2).setName("Air condition");
			Product updateedPrduct=productService.updateProduct(1, p);
			assertThat(updateedPrduct.getName()).isEqualTo("Air condition");
		}
		
		@Test
		void testcancelOrderById() throws GlobalException
		{
			
			Product cancel = productService.cancelOrderById(2);
			//assertThat(productService.cancelOrderById(1)).isNull();
			assertThrows(GlobalException.class, 
					()->productService.cancelOrderById(2));
			
		}
	
}

