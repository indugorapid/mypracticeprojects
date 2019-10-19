package org.indu.utility.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.indu.utility.model.Population;

public class CSVReader {

	public List<Population> readCSV(String filePath) {
		
		List<Population> populations = new ArrayList<>();
//        Path pathToFile = Paths.get(filePath);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

        	br.readLine();
            // read the first line from the text file
            String line = br.readLine();
            
            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Population population = createPopulation(attributes);

                // adding population into ArrayList
                populations.add(population);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

		
		return populations;
		
	}
	
	 private static Population createPopulation(String[] metadata) {
	        String country = metadata[0];
	        String gender = metadata[1];

	        int population = Integer.parseInt(metadata[2]);
	       
	        
	        return new Population(country, gender, population);
	    }
}
