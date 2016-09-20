package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectJavaAndDataBase {

	public static void main(String[] args) throws Exception {

		// create scanner object, message to user and take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the city: ");
		String city = input.nextLine();

		try {
			Connection con = getConnection(); // create connection to a database

			// The object used for executing a static SQL statement and
			// returning the results it produces
			Statement statement = con.createStatement();

			// takes all from selected city and print it
			ResultSet result = statement
					.executeQuery("SELECT * FROM city WHERE Name = '" + city
							+ "'");

			result.next();

			System.out.println("City: " + result.getString("Name") + " ");
			System.out.println("CountryCode: "
					+ result.getString("CountryCode") + " ");
			System.out.println("District: " + result.getString("District"));
			System.out.println("Population: " + result.getString("Population"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		input.close();
		getConnection();
	}

	/** establish connection with database */
	public static Connection getConnection() throws Exception {
		// write in try block to be able to catch any errors
		try {
			// variable to connect db
			String driver = "com.mysql.jdbc.Driver";

			// location of the db we want to connect to
			String url = "jdbc:mysql://localhost/world";

			// create username and password variables to get to db
			String username = "root";
			String password = "maja";

			Class.forName(driver);

			// establish connection using information we'we created above
			// get connection to the database world
			Connection con = DriverManager.getConnection(url, username,
					password);

			return con;

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}
}
