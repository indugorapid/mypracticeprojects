package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MedicalMain {

	private List<problems> problems;
	
	public List<problems> getProblems() {
		return problems;
	}

	public void setProblems(List<problems> problems) {
		this.problems = problems;
	}

	public static void main(String[] args) throws IOException {
		
        File jsonData = new  File("C:\\Users\\Indu\\Desktop\\myjson.json");
		String data =new InputStr
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		MedicalMain medical = objectMapper.readValue(jsonData, MedicalMain.class);
		System.out.println(medical);
	}

}
