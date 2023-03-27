package jdbcjavaexcercie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root1234");
		Statement statement = con.createStatement();
		int i = statement.executeUpdate("create table if not exists table1(id integer, name varchar(20), mark integer)");
		
		int i1=statement.executeUpdate(" insert into table1 values (001, 'sakre',23)");
		int i2=statement.executeUpdate(" insert into table1 values (001,'pradeep',32)");
		int i3=statement.executeUpdate(" insert into table1 values (001,'vivek',43)");
		System.out.println(i + " " + i1 + " " + i2 + " " + i3);
		ResultSet rs=statement.executeQuery("select * from table1");
		while(rs.next())
		System.out.println(rs.getInt(1)+ " " +rs.getString(2)+" "+rs.getInt(3));
	}
}
