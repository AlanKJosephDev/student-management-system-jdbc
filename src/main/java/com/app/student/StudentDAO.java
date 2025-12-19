package com.app.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public boolean InsertStudent(Student student) {
		String sql="insert into student(name) values(?)";
		try(Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1, student.getName());
			return ps.executeUpdate()>0;
		}
		catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}

	public List<Student> getAllStudents(){
		String sql="select * from student";
		List<Student> list=new ArrayList<>();
		
		try(Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery()){
			
			while(rs.next()) {
				list.add(new Student(rs.getInt("id"),rs.getString("name")));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean updateStudent(int id,String name) {
		
		String sql="update student set name=? where id=?";
		try (Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			
			ps.setString(1, name);
			ps.setInt(2, id);
			return ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}	
	}
	
	public boolean deleteStudent(int id) {
		
		String sql="delete from student where id=?";
		
		try (Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setInt(1, id);
			return ps.executeUpdate()>0;
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Student getStudentById(int id) {
		
		String sql="select * from student where id=?";
		
		try (Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				return new Student(rs.getInt("id"),rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
