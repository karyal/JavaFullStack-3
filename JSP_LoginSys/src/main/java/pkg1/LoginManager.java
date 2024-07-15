package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginManager {
	
	public void save(int uid, String fullName, String email, String phone, String loginName, String loginPassword, String userType) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT =3306;
		String DBNAME="dbLoginSys";
		String user="root";
		String password="pcps@123";
		String SQL="insert into users values(?, ?, ?, ?, ?, ?, ?);";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;		
		try{
			Class.forName(DRIVER);
			//connect
			Connection conn = DriverManager.getConnection(URL, user, password);
			PreparedStatement pstat = conn.prepareStatement(SQL);
			pstat.setInt(1, uid);
			pstat.setString(2, fullName);
			pstat.setString(3, email);
			pstat.setString(4, phone);
			pstat.setString(5, loginName);
			pstat.setString(6, loginPassword);
			pstat.setString(7, userType);
			pstat.executeUpdate(); //Insert, update, delete
			pstat.close();
			conn.close();
			System.out.println("Record insert successfully");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}
}
