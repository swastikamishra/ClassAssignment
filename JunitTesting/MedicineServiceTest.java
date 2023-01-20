 package com.test;
 import static org.junit.jupiter.api.Assertions.*;

 import org.junit.jupiter.api.AfterAll;
 import org.junit.jupiter.api.AfterEach;
 import org.junit.jupiter.api.BeforeAll;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 import com.test.exception.GlobalException;
 
 import static org.assertj.core.api.Assertions.assertThat;
public class MedicineServiceTest {

	static MedicineService MedicineService ;
	@BeforeAll
	static void init()
	{
		MedicineService =new MedicineService ();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		MedicineService.addMedicine("Meftal","10-2023","12-2025",10);
		MedicineService.addMedicine("KojicV","12-2022","10-2025",20);
	}

	@AfterAll
     static void tearDown() throws Exception {
		MedicineService=null;
		System.out.println("object gets garbage collected");
	}
	
	@BeforeEach
	void setUp1() throws Exception {
		MedicineService.companyDetails("Ayur","Mumbai");
		MedicineService.companyDetails("Himalaya","Pune");
	}

	@AfterAll
     static void tearDown1() throws Exception {
		MedicineService=null;
		System.out.println("object gets garbage collected");
	}
	
	@Test
	void testAddMedicine()
	{
		assertThat(MedicineService.lengthOfList()>0).isTrue();
	}
	@Test
	void testCompanyDetails()
	{
		assertThat(MedicineService.lengthOfList()>0).isTrue();
	}

}
