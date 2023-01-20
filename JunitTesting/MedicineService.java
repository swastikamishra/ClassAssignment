  package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.test.exception.GlobalException;


public class MedicineService {
	Scanner sc = new Scanner (System.in);
	ArrayList <MedicineDetails>  medicine = new ArrayList<MedicineDetails>();
	ArrayList <Company>  companies = new ArrayList<Company>();
    Set<MedicineDetails> medicineDetails = new HashSet<MedicineDetails>();
	
	void addMedicine (String medicineName, String medMfg,String medExp,int stock)
	{
		medicine.add(new MedicineDetails(medicineName, medMfg, medExp,stock));
		System.out.println("Medicine details added successfully!");
	}
	
	void companyDetails (String companyName, String branch)
	{
		companies.add(new Company(companyName,branch));
		System.out.println("Company details have been added");
	}
	
	void addMedToCompany (Company a) 
	{
			boolean status=false;
			
			  System.out.println("Enter medicine stock:"); int stock =sc.nextInt();
			
			for(int i=0;i<medicine.size();i++)
			{
				 if (stock == medicine.get(i).getStock()||stock< medicine.get(i).getStock())
				 {
				medicineDetails.add(medicine.get(i));
				a.setMedicine(medicineDetails);
				System.out.println("Medicine assigned to the company sucessfully!");
				status=true;
				break;
				 }
				
			}
			if(status==false)
			{
				System.out.println("Sorry! This medicine is out of stock!");
			}
		
	}
	
	 void addMedicines ()  throws GlobalException
	{
		System.out.println("Enter medicine name:");
	    String name =sc.nextLine();
	    for (int i=0;i< medicine.size();i++)
	    {
	    if (name.equalsIgnoreCase(medicine.get(i).getMedicineName()))
	    {
	    for (int j=0;j< medicine.size();j++)
	     {
		   if (name.equalsIgnoreCase(medicine.get(j).getMedicineName()));
		   {
			   Company c = companies.get(j);
			   addMedToCompany(c);   
		   }
	     }
	    }
	    else 
	    	throw new GlobalException("Medicine can't be found");
	    }

    }
	  
	 void medicineDetailsCompanywise () throws GlobalException
		{
			System.out.println("Enter Company name:");
		    String name =sc.nextLine();
		    for (int i=0;i< companies.size();i++)
		    {
		    if (name.equalsIgnoreCase(companies.get(i).getCompanyName()))
		    {
		    	Set<MedicineDetails> allMedicineDetails = companies.get(i).getMedicine();
		    	System.out.println("All medicines assigned under    company are as follows: ");
		    	System.out.println("");
		    	
		    	Iterator itr = allMedicineDetails.iterator();
		    	while(itr.hasNext())
		    	{
		    		MedicineDetails md = (MedicineDetails) itr.next();
		    		System.out.println("Medicine Name: "+md.getMedicineName());
		    		System.out.println("Medicine Manufacturing Date: "+md.getMedMfg());
		    		System.out.println("Medicine Expiry Date: "+md.getMedExp());
		    		System.out.println("Medicine Total Stock: "+md.getStock());
		    		System.out.println(" ");
		    	}
		    }
		    else throw new GlobalException("No such company can be found.");
		    }
		}
	 
	 int lengthOfList()
	{
		return medicine.size();
	}
	 
	 void medAssignmentCheck()
	 {
		 
	 }

}
