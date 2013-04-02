package com.packeasy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class MyTripListDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static MyTripListBean getList(MyTripListBean bean)
	{
		Statement stmt = null;
		String uid = bean.getUid();
		String searchQuery = "select * from tb_mytrip where uid='" + uid;
		System.out.println(searchQuery);
		try
		{
			//connecting to the DB
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean userExists = rs.next();
			
			if (!userExists)
			{
				System.out.println("Username/Password entered is Incorrect or User doesnot Exists.");
			}
			else if (userExists)
			{
				String tripName = rs.getString("tripName");
				bean.setTripName(tripName);
				String tripLocation = rs.getString("tripLocation");
				bean.setTripLocation(tripLocation);
				String startDate = rs.getString("startDate");
				bean.setStartDate(startDate);
				String endDate = rs.getString("endDate");
				bean.setEndDate(endDate);
				int reminder = rs.getInt("reminder");
				bean.setReminder(reminder);
				int numPackList = rs.getInt("numPackList");
				bean.setNumPackList(numPackList);
				bean.setValid(true);
			}
		} catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}
		return bean;
	}
}
