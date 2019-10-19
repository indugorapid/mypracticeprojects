package com.example.demo;

public class AssociatedDrug {

	private String name;
	private String dose;
	private int strength;
	
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
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	@Override
	public String toString(){
		return getName() + ", "+getDose()+", "+getStrength();
	}

}
