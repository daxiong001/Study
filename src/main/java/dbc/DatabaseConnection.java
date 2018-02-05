package dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {
	private static final String dbdriver="com.dxk.mysql.driver";
	private static final String dburl="jdbc:mysql//localhost:3306/mldn";
	private static final String dbuser="root";
	private static final String dbpassword="root";       //加载数据库信息
	private Connection conn=null;
	public DatabaseConnection() throws Exception{	
		
			Class.forName(dbdriver);//加载数据库驱动
			this.conn=DriverManager.getConnection(dburl, dbuser, dbpassword);						 
	}
	public Connection getconnection(){       //取得数据库连接
		return this.conn;
	}
	public void close() throws Exception{       //数据库连接关闭
		if (this.conn!=null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw e;
			}
		}
		
		}
}
