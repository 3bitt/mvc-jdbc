package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;
import org.sqlite.SQLiteConfig;

import interfejs.CompDAOInterf;
import interfejs.OrderDAOInterf;

public class MysqlDAO extends DAOFactory{

	private static final String user = "root";
	private static final String pass = "";
	
	private static final String DBURL = "jdbc:mysql://localhost/mydb";
	private static final String DRIVER = "com.mysql.jdbc.Driver";	
    private static final String CHARSET = "?useUnicode=true&characterEncoding=UTF-8";

	
	public static Connection Connect() {
		Connection con = null;		
		try   {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(DBURL + CHARSET, user, pass);
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
        	System.out.println(e);        
        }
		return con;		
	}
	
	@Override
	public CompDAOInterf getCDAO() {
		return new MysqlObjectDAO();
	}

	@Override
	public OrderDAOInterf getODAO() {
		return new MysqlObjectDAO();
	}	
}
