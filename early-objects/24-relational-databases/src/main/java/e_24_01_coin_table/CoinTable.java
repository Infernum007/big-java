package e_24_01_coin_table;

import utils.SimpleDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Write a Java program that creates a Coin table with coin names and values;
 * inserts coin types penny, nickel, dime, quarter, half dollar, and dollar;
 * and prints out the sum of the coin values. Use SQL commands {@code CREATE
 * TABLE}, {@code INSERT}, and {@code SELECT SUM}.
 */
public class CoinTable
{
    public static void main(String[] args) throws IOException
    {
        SimpleDataSource.init();

        try (Connection conn = SimpleDataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS Coin(c_name VARCHAR(20), c_value INT(2))");
            stmt.execute("INSERT INTO Coin VALUES ('Penny', 1)");
            stmt.execute("INSERT INTO Coin VALUES ('Nickel', 5)");
            stmt.execute("INSERT INTO Coin VALUES ('Dime', 10)");
            stmt.execute("INSERT INTO Coin VALUES ('Quarter', 25)");
            stmt.execute("INSERT INTO Coin VALUES ('Half Dollar', 50)");
            stmt.execute("INSERT INTO Coin VALUES ('Dollar', 100)");

            String query = "SELECT sum(c_value) AS 'sum' FROM Coin";
            ResultSet result = stmt.executeQuery(query);
            System.out.println();
            result.next();
            System.out.println("Sum = " + result.getString("sum"));

            stmt.execute("DROP TABLE IF EXISTS Coin");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
