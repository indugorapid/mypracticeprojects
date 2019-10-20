package com.example.demo;

public class AssociatedDrug {

	private String name;
	private String dose;
	private String strength;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	
	@Override
	public String toString(){
		return getName() + ", "+getDose()+", "+getStrength();
	}

}
