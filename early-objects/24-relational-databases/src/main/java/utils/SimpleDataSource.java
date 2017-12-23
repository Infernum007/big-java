package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

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

    public static void createTables() throws FileNotFoundException, SQLException
    {
        final String[] sqlCommands = {
                "early-objects/24-relational-databases/src/main/resources/Customer.sql",
                "early-objects/24-relational-databases/src/main/resources/Invoice.sql",
                "early-objects/24-relational-databases/src/main/resources/LineItem.sql",
                "early-objects/24-relational-databases/src/main/resources/Product.sql"
        };

        for (final String sqlCommand : sqlCommands) {
            try (Scanner in = new Scanner(new File(sqlCommand))) {
                try (Connection conn = SimpleDataSource.getConnection();
                     Statement stat = conn.createStatement()) {
                    while (in.hasNextLine()) {
                        String line = in.nextLine();
                        stat.execute(line);
                    }
                }
            }
        }
    }

    public static void dropTables() throws SQLException
    {
        List<String> tableNames = getDatabaseTableNames();
        try (Connection conn = SimpleDataSource.getConnection();
             Statement stmt = conn.createStatement()) {
            for (String tn : tableNames) {
                stmt.execute("DROP TABLE IF EXISTS bigJavaDB." + tn);
            }
        }
    }

    public static List<String> getDatabaseTableNames() throws SQLException
    {
        List<String> tableNames = new ArrayList<>();
        try (Connection conn = getConnection()) {
            DatabaseMetaData meta = conn.getMetaData();
            ResultSet mrs = meta.getTables(null, null, "%", new String[]{"TABLE"});
            while (mrs.next()) {
                tableNames.add(mrs.getString(3));
            }
        }
        return tableNames;
    }
}
