package demo.code.service;

import java.util.List;

import demo.code.entity.Student;

public interface StudentService {

	public List<Student> getStudents();
	public void saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int studentId);
}
