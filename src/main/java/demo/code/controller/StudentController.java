package demo.code.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.code.entity.Student;
import demo.code.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/all")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student){
		studentService.saveStudent(student); 
		return "Successfull Created!!!";
	}
	
	@PutMapping("/{studentId}/update")
	public String updateStudent(@PathParam("studentId") int studentId, @RequestBody Student student){
		studentService.equals(student);
		return "Successfully Updated!!!";
	}
	
	@DeleteMapping("/{studentId}/delete")
	public String deleteStudent(@PathParam("studentId") int studentId){
		studentService.deleteStudent(studentId);
		return "Successfully Deleted!!!";
	}
}
