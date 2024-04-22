package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.cp;
import com.eb.pojo.Student;

public class studentdao {
 public static boolean createStudent(Student s) {
	 try {
		 boolean f=false;
		 Connection conn=cp.createc();
		 String query="insert into student(studname,studphoneno,studcity)values(?,?,?)";
		 PreparedStatement p=conn.prepareStatement(query);
		 p.setString(1,s.getStudentName());
		 p.setString(2,s.getStudentPhone());
		 p.setString(3,s.getStudentCity());
		 p.executeUpdate();
		 f=true;
		
		 
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return false;
 }
 public static boolean updateStudentData(int val,String toUpdate,int id,Student s) {
	 boolean f=false;
	 try {
		 Connection conn=cp.createc();
		 if(val==1) {
			 String query="update student set studname=? where studid=? ";
			 PreparedStatement ps=conn.prepareStatement(query);
			 ps.setString(1,toUpdate);
			 ps.setInt(2, id);
			 ps.executeUpdate();
			 f=true;
			 }
		 else if(val==2) {
			 String query="update student set studphoneno=? where studid=? ";
			 PreparedStatement ps=conn.prepareStatement(query);
			 ps.setString(1,toUpdate);
			 ps.setInt(2, id);
			 ps.executeUpdate();
			 f=true;
			 }
		 else if(val==3) {
			 String query="update student set studcity=? where studid=? ";
			 PreparedStatement ps=conn.prepareStatement(query);
			 ps.setString(1,toUpdate);
			 ps.setInt(2, id);
			 ps.executeUpdate();
			 f=true;
			 }
		 else {
			 System.out.println("no updation");
		 }

 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return false;
}
 public static void showAllStudent() {
	 boolean f=false;
	 try {
		 Connection conn=cp.createc();
		 String query="select* from student";
		 Statement st=conn.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 while(rs.next()) {
			 int id =rs.getInt(1);
			 String studname=rs.getString(2);
			 String studphoneno=rs.getString(3);
			 String studcity=rs.getString(4);
			 System.out.println("Student Id:"+id+"\n Student Name:"+studname+
					 "\n Student Phone Number:"+studphoneno+"\n Student City:"+studcity);
			 
		 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
 }
 }
 public static boolean deleteStudent(int studid) {
	 boolean f=false;
		try {
			Connection conn=cp.createc();
		String query="delete from menu where menuid=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, studid);
		ps.executeUpdate();
		f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
 }

