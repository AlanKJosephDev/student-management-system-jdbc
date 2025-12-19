package com.app.student;

import java.util.List;
import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentService();
		
		while(true) {
			System.out.println("Enter Choice:\n1.Insert Student\n2.Display All Student\n3.Update Student\n4.Delete Student\n5.Search Student\n6.Exit");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:{
				System.out.println("Enter Name:");
				String name=sc.nextLine();
				System.out.println(service.addStudent(name)?"Student Insertion successfully":"Insertion failed");
			}
			break;
			case 2:{
				List<Student> list=service.fetchAllStudents();
				list.forEach(s ->System.out.println(s.getId()+" "+s.getName()));
			}
			break;
			case 3:{
				System.out.println("Enter id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name:");
				String name=sc.nextLine();
				System.out.println(service.updateStudent(id, name)?"Update Successful":"Update failed");
			}
			break;
			case 4:{
				System.out.println("Enter id:");
				int id=sc.nextInt();
				System.out.println(service.deleteStudent(id)?"Delete successful":"Delete failed");
			}
			break;
			case 5:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				Student s=service.searchStudent(id);
				System.out.println(s!=null?s.getId()+" "+s.getName():"Student not found");
			}
			break;
			case 6:{
				System.out.println("Exiting....");
				System.exit(0);
			}
			default:System.out.println("Invalid choice");
			}
		}

	}

}
