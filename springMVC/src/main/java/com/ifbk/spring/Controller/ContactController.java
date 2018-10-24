package com.ifbk.spring.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
import java.io.PrintWriter; 
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import com.ifbk.spring.model.Student;
import com.ifbk.spring.model.User1;
import com.ifbk.spring.dao.StudentJDBCTemplate;
import java.util.List;
import com.ifbk.spring.dao.StudentJPA;

@Controller
@SessionAttributes
public class ContactController {
    @Autowired
    StudentJDBCTemplate studentJDBCTemplate;
    @Autowired
    StudentJPA studentJPA;
    
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("Student")	Student student, BindingResult result) {
    
//		  StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
	    	      
		  System.out.println("------Records Creation--------" );
		  System.out.println("name="+student.getId() + "" + student.getName()+" "+student.getAge());
		  studentJDBCTemplate.create(student.getId(), student.getName(), student.getAge());
//		  studentJDBCTemplate.create(20,"Nuha", 2);
//		  studentJDBCTemplate.create(30,"Ayan", 15);
		  studentJPA.create(student.getId()+10, student.getName(), student.getAge()+1);
		
		  System.out.println("------Listing Multiple Records--------" );
		  List<Student> students = studentJDBCTemplate.listStudents();
		  
		  for (Student record : students) {
		     System.out.print("ID : " + record.getId() );
		     System.out.print(", Name : " + record.getName() );
		     System.out.println(", Age : " + record.getAge());
		     
		  }  		
		return "redirect:contact.html";
	}
	
	@RequestMapping("/contact")
	public ModelAndView showContacts() {
		Student aa = new Student();
		return new ModelAndView("contact", "command", aa);
	}
	@RequestMapping("/employ")  
    public ModelAndView shoeEmploy() {  
        return new ModelAndView("employ");
    }  		
    @RequestMapping("/addUser1")  
    public void addUser(User1 user1, HttpServletRequest request,  
            HttpServletResponse response) {  
   
        System.out.println("过来了");  
        String result = "{\"name\":\"" + user1.getName() + "\"}";  
        PrintWriter out = null;  
        System.out.println(result); 
       
        response.setContentType("application/json");  
        try {  
            out = response.getWriter();  
            out.write(result);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  		
}

