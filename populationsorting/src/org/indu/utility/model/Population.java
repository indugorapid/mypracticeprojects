package org.indu.utility.model;

public class Population {

	private String country;
	private String gender;
	private int population;

	public Population(String country, String gender, int population) {
		super();

		this.country = country;
		this.gender = gender;
		this.population = population;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Population [country=" + country + ", gender=" + gender + ", population=" + population + "]";
	}
}
