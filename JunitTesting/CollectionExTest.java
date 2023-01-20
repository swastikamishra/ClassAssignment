package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(value = OrderAnnotation.class)
class CollectionExTest {

	static CollectionEx cal;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cal=new CollectionEx();
	}



	@Test
	@Order(1)
	void testAddName() {
		cal.addName("anurag");
		cal.addName("surya");
		cal.addName("shreya");
		assertEquals(3, cal.length(),"Adding 3 data in the list");
	}
    @Test
    @Order(4)
	void testRemoveName()
	{
		cal.removeName("anurag");
		assertEquals(2, cal.length(),"removing  1 data from the list");
		
	}
    
    @Test
    @Order(5)
    void testRemoveAll() 
    {
    	cal.removeAllName();
    	assertThat(cal.length()).isEqualTo(0);
    }
    
    @Test
    @Order(value = 2)
    void testGetName()
    {
    	assertThat(cal.getName(1)).isEqualTo("surya");
    }
    
    @Test
    @Order(3)
    void testUpdateName()
    {
    	cal.updateName(2, "shreya soni");
    	assertThat(cal.getName(2)).isEqualTo("shreya soni");
    }
}
