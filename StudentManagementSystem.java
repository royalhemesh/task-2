package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> students = new ArrayList<>();

    // Create (Add) a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Read (View) all students
    public void viewStudents() {
        for(Student s: students) {
        	System.out.println(s);
        }
    }

    // Update a student's details
	public void updateStudent(int id, String fieldName, String newValue) {
        for (Student s : students) {
            if (s.getId() == id) {
                if (fieldName.equals("name")) {
                    s.setName(newValue);
                    System.out.println("\n");
                } else if (fieldName.equals("grade")) {
                    s.setGrade(newValue);
                }
                Student value=students.get(students.indexOf(s));
                System.out.println("the updated values are:"+value);
                System.out.println("\n");
                break;
            }
        }
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

   
	public void Filecreation(String filePath) {
		
		    String fileName = filePath + File.separator + "student_data_" + new Date().getTime() + ".txt";

		    try (FileWriter writer = new FileWriter(fileName)) {
		        for (Student element : students) {
		            writer.write(element + "\n"); // Write each element followed by a newline
		        }
		        System.out.println("Array elements written to " + fileName);
		        System.out.println("\n");
		        
		    } catch (IOException e) {
		        System.err.println("Error writing to file: " + e.getMessage());
		    }
		
		
	}
	
	
}
