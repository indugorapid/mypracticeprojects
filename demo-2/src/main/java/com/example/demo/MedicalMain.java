package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MedicalMain {

	private List<Problem> problems;

	public List<Problem> getProblems() {
		return problems;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	public static void main(String[] args) throws IOException {

		String jsonStr = new String(Files.readAllBytes(
				new File(MedicalMain.class.getClassLoader().getResource("myjson.json").getPath()).toPath()));

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// convert json to MedicalMain object
		MedicalMain medical = objectMapper.readValue(jsonStr, MedicalMain.class);
		Set<String> medicineNames = new HashSet<String>();
		
		
		for (Problem problem : medical.problems) {
			
			for(Diabetes diabetes: problem.getDiabetes()) {
				
				for(Medication medication : diabetes.getMedications()) {
					
					for(MedicationsClass medicationsClass : medication.getMedicationsClasses()) {
						
						for(ClassName className : medicationsClass.getClassName()) {
							
							for(AssociatedDrug associatedDrug : className.getAssociatedDrug()) {
								
								medicineNames.add(associatedDrug.getName());
							}
						}
					}
				}
			}
		}
		
		Iterator<String> medicineNamesIterator = medicineNames.iterator();
		while(medicineNamesIterator.hasNext()) {
			System.out.println(medicineNamesIterator.next());
		}


	}
}
