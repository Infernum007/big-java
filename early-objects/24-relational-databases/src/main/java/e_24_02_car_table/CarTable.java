package e_24_02_car_table;

import utils.SimpleDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Write a Java program that creates a Car table with car manufacturers, models,
 * model years, and fuel efficiency ratings. Insert several cars. Print out
 * the average fuel efficiency. Use SQL commands {@code CREATE TABLE}, {@code
 * INSERT}, and {@code SELECT AVG}.
 */
public class CarTable
{
    public static void main(String[] args) throws IOException, SQLException
    {
        SimpleDataSource.init();

        try (Connection conn = SimpleDataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS Car(manufacturer VARCHAR(20)," +
                                 "model VARCHAR(20), model_years VARCHAR(20)," +
                                 "fuel_efficiency INTEGER(2))");
            stmt.execute("INSERT INTO Car VALUES ('Mercedes', 'C600', '1996', 5)");
            stmt.execute("INSERT INTO Car VALUES ('BMW', 'X5', '2000', 3)");
            stmt.execute("INSERT INTO Car VALUES ('Audi', '300', '2001', 4)");

            String query = "SELECT avg(fuel_efficiency) AS 'efficiency' FROM Car";
            ResultSet result = stmt.executeQuery(query);
            result.next();
            System.out.println("Fuel efficiency = " + result.getString("efficiency"));

            stmt.execute("DROP TABLE IF EXISTS Car");
        }
    }
}
