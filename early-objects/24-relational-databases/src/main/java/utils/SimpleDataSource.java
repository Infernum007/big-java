package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * A simple data source for getting database connection.
 */
public class SimpleDataSource
{
    private static String url;
    private static String username;
    private static String password;

    /**
     * Initializes the data source.
     */
    public static void init() throws IOException
    {
        String dbProps = "early-objects/24-relational-databases/src/main/resources/db.properties";
        Properties props = new Properties();

        try (InputStream in = Files.newInputStream(Paths.get(dbProps))) {
            props.load(in);
        }

        url = props.getProperty("jdbc.url");

        username = props.getProperty("jdbc.user");
        if (username == null) username = "";

        password = props.getProperty("jdbc.pass");
        if (password == null) password = "";
    }

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url, username, password);
    }
}
