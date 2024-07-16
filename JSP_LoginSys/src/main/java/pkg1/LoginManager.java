package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginManager {
	
	public void search(String strSearch) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT =3306;
		String DBNAME="dbLoginSys";
		String USER="root";
		String PASSWORD="pcps@123";
		String SQL="SELECT * FROM users WHERE full_name='"+strSearch+"' OR email='"+strSearch+"' OR phone='"+strSearch+"' OR login_name='"+strSearch+"' OR login_password='"+strSearch+"' OR user_type='"+strSearch+"'";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;	
		boolean result = new Utilities().isNumeric(strSearch);
		if(result) {
			SQL="SELECT * FROM users WHERE uid="+strSearch;
		}
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pstat = conn.prepareStatement(SQL);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("uid")+", "+rs.getString("full_name")+", "+rs.getString("phone")+", "+rs.getString("email")+", "+rs.getString("login_name")+", "+rs.getString("login_password")+", "+rs.getString("user_type"));
			}
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
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
