package org.indu.utility.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.indu.utility.model.Population;

public class DBUtility {

	public void storePopulation(List<Population> population,String tableName) {

		
		Connection conn = connect("jdbc:mysql://localhost:3306/db_pop", "root", "root");
		importData(conn, population, tableName);

	}

	
	
	
	
	private Connection connect(String db_connect_str, String db_userid, String db_password) {
		Connection conn;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection(db_connect_str, db_userid, db_password);

		} catch (Exception e) {
			e.printStackTrace();
			conn = null;
		}

		return conn;
	}

	private void importData(Connection conn, List<Population> populations,String tableName) {
		Statement stmt;
		String query;

		try {
			stmt = conn.createStatement();

			query = "INSERT INTO  "+ tableName + "(country, gender,population) VALUES";
			int count = 0;
			for (Population pop : populations) {
				if (count > 0) {
					query += ",";
				}
				query += "('" + pop.getCountry() + "','" + pop.getGender() + "'," + pop.getPopulation() + ")";

				count++;
			}
			System.out.println(query);

			stmt.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
			stmt = null;
		}
	}

}
