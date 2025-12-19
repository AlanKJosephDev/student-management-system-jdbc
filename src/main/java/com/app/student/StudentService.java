package com.app.student;

import java.util.List;

public class StudentService {

	private final StudentDAO dao=new StudentDAO();
	
	public boolean addStudent(String name) {
		
		if(name==null||name.trim().isEmpty()) {
			System.out.println("Name can't be empty");
			return false;
		}
		return dao.InsertStudent(new Student(name));
	}
	
	public List<Student> fetchAllStudents(){
		return dao.getAllStudents();
	}
	
	public boolean deleteStudent(int id) {
		return id>0 && dao.deleteStudent(id);
		
	}
	
	public boolean updateStudent(int id,String name) {
		if(id>=0 && name.trim().isEmpty()) {
			return false;
		}
		return dao.updateStudent(id, name);	
	}
	
	public Student searchStudent(int id) {
		return id>0 ? dao.getStudentById(id): null;
		
	}
}
