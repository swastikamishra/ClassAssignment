package com.test;

public class MedicineDetails {
	
	private String medicineName;
	private String medMfg;
	private String medExp;
	private int stock;
	
	public MedicineDetails(String medicineName, String medMfg,String medExp,int stock)
	{
		this.medicineName=medicineName;
		this.medMfg=medMfg;
		this.medExp=medExp;
		this.stock=stock;
	}

	public MedicineDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MedicineDetails [medicineName=" + medicineName + ", medMfg=" + medMfg + ", medExp=" + medExp
				+ ", stock=" + stock + "]";
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedMfg() {
		return medMfg;
	}

	public void setMedMfg(String medMfg) {
		this.medMfg = medMfg;
	}

	public String getMedExp() {
		return medExp;
	}

	public void setMedExp(String medExp) {
		this.medExp = medExp;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
