package com.test;

import java.util.Set;



public class Company {
	
	private Set<MedicineDetails> medicine; 
	private String companyName;
	private String branch;
	
	
	public Company (String companyName, String branch )
	{
		this.companyName=companyName;
		this.branch=branch;
	}


	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Company [medicine=" + medicine + ", companyName=" + companyName + ", branch=" + branch + "]";
	}


	public Set<MedicineDetails> getMedicine() {
		return medicine;
	}


	public void setMedicine(Set<MedicineDetails> medicine) {
		this.medicine = medicine;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	


}
