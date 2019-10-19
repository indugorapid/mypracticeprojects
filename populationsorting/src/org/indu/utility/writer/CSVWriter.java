package org.indu.utility.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.indu.utility.model.Population;

public class CSVWriter {

	public void exportCSV(List<Population> populations, String filePath) {
		try {
			FileWriter outputfileWriter = new FileWriter(filePath);
			outputfileWriter.append("Country");
			outputfileWriter.append(",");
			outputfileWriter.append("Gender");
			outputfileWriter.append(",");
			outputfileWriter.append("Population");
			outputfileWriter.append("\n");

			for (Population p : populations) {
				outputfileWriter
						.append(String.join(",", p.getCountry(), p.getGender(), String.valueOf(p.getPopulation())));
				outputfileWriter.append("\n");
			}

			outputfileWriter.flush();
			outputfileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}