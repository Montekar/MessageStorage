package dal;

import be.Message;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLClientInfoException;

public class DatabaseConnector {
    SQLServerDataSource dataSource;

    public DatabaseConnector() {
        dataSource = new SQLServerDataSource();
        try {
            dataSource.setServerName("10.176.111.31");
            dataSource.setDatabaseName("MessageStorage");
            dataSource.setUser("CSe20B_14");
            dataSource.setPassword("CSe20B_14");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLClientInfoException, SQLServerException {
        return dataSource.getConnection();
    }
}
