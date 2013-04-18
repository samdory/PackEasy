package com.packeasy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MyTripListDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static ArrayList<MyTripListBean> getList(String uid)
	{
		Statement stmt = null;
		//
		ArrayList<MyTripListBean> list = new ArrayList<MyTripListBean>();
		//
		String searchQuery = "select * from tb_mytrip where uid='" + uid+"' order by start_date desc";
		System.out.println(searchQuery);
		try
		{
			//connecting to the DB
			currentCon = ConnectionManager.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			while(rs.next())
			{
				String tripName = rs.getString("trip_name");
				String tripLocation = rs.getString("trip_location");
				String startDate = rs.getString("start_date");
				String endDate = rs.getString("end_date");
				int numPackList = rs.getInt("num_packing_list");
				int reminder = rs.getInt("reminder");
				MyTripListBean dto = new MyTripListBean(uid, tripName, tripLocation, startDate, endDate, numPackList, reminder);
				//
				list.add(dto);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(currentCon!=null)currentCon.close();
			}
			catch(Exception e){}
		}
		return list;
	}
}
