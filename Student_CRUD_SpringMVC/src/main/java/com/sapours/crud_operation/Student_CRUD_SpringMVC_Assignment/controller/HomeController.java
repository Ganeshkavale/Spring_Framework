package com.sapours.crud_operation.Student_CRUD_SpringMVC_Assignment.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*import com.sapours.crud_dao.StudentDao;*/
import com.sapours.crud_dao.StudentDao1;
import com.sapours.crud_designcopy.Student;

@Controller
public class HomeController {

	@Autowired
	StudentDao1 dao;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value ="/loginPage", method = RequestMethod.POST)
	public String homePageBack() {
				
		return "LoginPage";
	}

	
	@RequestMapping(value ="/home", method = RequestMethod.POST)
	public String loginValidation(Student student) throws ClassNotFoundException, SQLException {
				
		if(dao.getValidation(student.getUsername(), student.getPassword())) {
			return "home";
		}
		return "Relogin";
	}

	@RequestMapping(value ="/home1", method = RequestMethod.POST)
	public String homeView() {		
		
		return "home";
	}

	@RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
	public String inserStudent(Student student) {

		dao.save(student);
		
		return "insertStudent";
	}

	@RequestMapping(value = "/deleteStudentById", method = RequestMethod.POST)
	public String deleteStudent(Student student) {

		int id = student.getId();
		dao.deleteStudentDataById(id);
		
		return "deleteStudentById";
	}

	@RequestMapping(value = "/updateStudentById", method = RequestMethod.POST)
	public String updateStudent(Student student) {

		dao.updateStudentDataById(student);
		
		return "updateStudentById";
	}
	
	@RequestMapping(value = "/displayStudent", method = RequestMethod.POST)  
	public String viewemp(Model m){    
	       
		List<Student> listStudents=dao.displayStudent();    
	    m.addAttribute("list",listStudents);  
	    return "displayStudent";    
	} 
	 
}