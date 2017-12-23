package e_24_03_format_output;

import utils.SimpleDataSource;

import java.io.IOException;
import java.sql.*;
import java.util.List;

/**
 * Improve the {@code ExecSQL} program and make the columns of the output
 * line up. <em>Hint:</em> Use the {@code getColumnDisplaySize} method
 * of the {@code ResultSetMetaData} class.
 */
public class ExecSQL
{
    public static void main(String[] args) throws IOException, SQLException
    {
        dbStart();

        List<String> tableNames = SimpleDataSource.getDatabaseTableNames();

        try (Connection conn = SimpleDataSource.getConnection();
             Statement stmt = conn.createStatement()) {
            for (String tableName : tableNames) {
                final String query = "SELECT * FROM " + tableName;
                boolean hasResult = stmt.execute(query);
                if (hasResult) {
                    try (ResultSet rs = stmt.getResultSet()) {
                        showResultSet(rs);
                    }
                }
            }
        }
    }

    /**
     * Prints a result set.
     *
     * @param result the result set
     */
    public static void showResultSet(ResultSet result) throws SQLException
    {
        ResultSetMetaData meta = result.getMetaData();
        int columnCount = meta.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            final int cSize = getColumnSize(meta, i);
            System.out.printf("%-" + cSize + "s ", meta.getColumnLabel(i));
        }
        System.out.println();

        while (result.next()) {
            for (int i = 1; i <= columnCount; i++) {
                final int cSize = getColumnSize(meta, i);
                System.out.printf("%-" + cSize + "s ", result.getString(i));
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int getColumnSize(ResultSetMetaData meta, int index) throws SQLException
    {
        final int size = meta.getColumnDisplaySize(index);
        final int colNameLength = meta.getColumnLabel(index).length();
        return colNameLength > size ? colNameLength : size;
    }

    public static void dbStart() throws IOException, SQLException
    {
        SimpleDataSource.init();
        SimpleDataSource.dropTables();
        SimpleDataSource.createTables();
    }
}
