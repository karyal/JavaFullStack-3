package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginManager {
	
	public boolean login(String strUser, String strPass) {
		boolean result=false;
		String SQL="SELECT * FROM users WHERE login_name=? AND login_password=?";			
		User user = null;
		try {
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			pstat.setString(1, strUser);
			pstat.setString(2, strPass);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				user = new User(rs.getInt("uid"), rs.getString("full_name"), rs.getString("phone"), rs.getString("email"), rs.getString("login_name"), rs.getString("login_password"), rs.getString("user_type"));
				//System.out.println(rs.getInt("uid")+", "+rs.getString("full_name")+", "+rs.getString("phone")+", "+rs.getString("email")+", "+rs.getString("login_name")+", "+rs.getString("login_password")+", "+rs.getString("user_type"));
				//System.out.println(user);
				result = true;
			}
			rs.close();
			conn.close();			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	public User search(int uid) {
		String SQL="SELECT * FROM users WHERE uid="+uid+"";
		User user = null;
		try {
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			ResultSet rs = pstat.executeQuery();			
			while(rs.next()) {
				user = new User(rs.getInt("uid"), rs.getString("full_name"), rs.getString("phone"), rs.getString("email"), rs.getString("login_name"), rs.getString("login_password"), rs.getString("user_type"));
				System.out.println(rs.getInt("uid")+", "+rs.getString("full_name")+", "+rs.getString("phone")+", "+rs.getString("email")+", "+rs.getString("login_name")+", "+rs.getString("login_password")+", "+rs.getString("user_type"));
			}
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
	
	public List<User> search(String strSearch) {
		String SQL="SELECT * FROM users WHERE full_name='"+strSearch+"' OR email='"+strSearch+"' OR phone='"+strSearch+"' OR login_name='"+strSearch+"' OR login_password='"+strSearch+"' OR user_type='"+strSearch+"'";
		boolean result = new Utils().isNumeric(strSearch);
		if(result) {
			SQL="SELECT * FROM users WHERE uid="+strSearch;
		}
		List users = null;
		try {
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			ResultSet rs = pstat.executeQuery();
			users = new ArrayList<User>();
			
			while(rs.next()) {
				User user = new User(rs.getInt("uid"), rs.getString("full_name"), rs.getString("phone"), rs.getString("email"), rs.getString("login_name"), rs.getString("login_password"), rs.getString("user_type"));
				users.add(user);
				System.out.println(rs.getInt("uid")+", "+rs.getString("full_name")+", "+rs.getString("phone")+", "+rs.getString("email")+", "+rs.getString("login_name")+", "+rs.getString("login_password")+", "+rs.getString("user_type"));
			}
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return users;
	}
	
	public boolean save(String fullName, String email, String phone, String loginName, String loginPassword, String userType) {
		boolean result=false;
		
		String SQL="insert into users values(?, ?, ?, ?, ?, ?, ?);";
	
		try{
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			pstat.setInt(1, 0);
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
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error1 : "+ex.getMessage());
			result=false;
		}
		return result;
	}
	
	public boolean update(int uid, String fullName, String email, String phone, String loginName, String loginPassword, String userType) {
		boolean result=false;
		
		String SQL="update users set full_name=?, email=?, phone=?, login_name=?, login_password=?, user_type=? WHERE uid=?;";
		
		try{
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			pstat.setString(1, fullName);
			pstat.setString(2, email);
			pstat.setString(3, phone);
			pstat.setString(4, loginName);
			pstat.setString(5, loginPassword);
			pstat.setString(6, userType);
			pstat.setInt(7, uid);
			pstat.executeUpdate(); //Insert, update, delete
			pstat.close();
			conn.close();
			System.out.println("Record update successfully");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error1 : "+ex.getMessage());
			result=false;
		}
		return result;
	}
	public boolean delete(int uid) {
		boolean result=false;
		String SQL="delete from users WHERE uid=?;";
		try{
			Connection conn = new MyDB().connect();
			PreparedStatement pstat = conn.prepareStatement(SQL);
			pstat.setInt(1, uid);
			pstat.executeUpdate(); //Insert, update, delete
			pstat.close();
			conn.close();
			System.out.println("Record delete successfully");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error1 : "+ex.getMessage());
			result=false;
		}
		return result;
	}
}
