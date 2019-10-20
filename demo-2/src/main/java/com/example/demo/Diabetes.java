package com.example.demo;

import java.util.List;

public class Diabetes {

	private List<Medication> medications;
	private List<Lab> labs;


	public List<Lab> getLabs() {
		return labs;
	}

	public void setLabs(List<Lab> labs) {
		this.labs = labs;
	}

	public List<Medication> getMedications() {
		return medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}
}
