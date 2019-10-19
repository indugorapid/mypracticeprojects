package org.indu.utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.indu.utility.db.DBUtility;
import org.indu.utility.model.Population;
import org.indu.utility.reader.CSVReader;
import org.indu.utility.writer.CSVWriter;

public class PopulationStarter {

	public static void main(String[] args) {
		
		String filePath = "../../../population.csv";
		
		// TODO Auto-generated method stub
      CSVReader csvReader = new CSVReader();
      List<Population> populations = csvReader.readCSV( filePath);
      for (Population p : populations) {
          System.out.println(p);
      }
      
        DBUtility dbutility = new DBUtility();
        dbutility.storePopulation(populations,"population");
        
      Collections.sort(populations, new Comparator() {
			
			public int compare(Object o1, Object o2) {
				
				String x3 = ((Population) o1).getGender();
	            String x4 = ((Population) o2).getGender();
				
				
				int sComp = x4.compareTo(x3);

				if (sComp != 0) {
		               return sComp;
		            } 
				
				Integer x1 = ((Population) o1).getPopulation();
				Integer x2 = ((Population) o2).getPopulation();
	            return x2.compareTo(x1);
		}});
      System.out.println(populations);
      dbutility.storePopulation(populations,"population_output");
      
      CSVWriter csvWriter = new CSVWriter();
      csvWriter.exportCSV(populations, "../../../population_output.csv");
      
	}

	
}
