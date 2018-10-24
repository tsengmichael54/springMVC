package com.ifbk.spring.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ifbk.spring.model.Student;

public class StudentJDBCTemplate implements StudentDAO {
   private DataSource dataSource1;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource1 = dataSource;
      try{
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
      System.out.println("set data Source");
      } catch(Exception E){
    	  System.out.println("set data Source error");  
      }
      
   }
   public void create(Integer id, String name, Integer age) {
      String SQL = "insert into Student (id,name, age) values (?, ?, ?)";
      if (jdbcTemplateObject == null) {
    	  System.out.println("jdbcTemplateObject is null"); 
      }
//      this.jdbcTemplateObject = new JdbcTemplate(dataSource1);
      jdbcTemplateObject.update( SQL, id, name, age);
      System.out.println("Created Record Name = " + name + " Age = " + age);
      return;
   }
   public List<Student> listStudents() {
      String SQL = "select * from Student";
      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
      return students;
   }
}
