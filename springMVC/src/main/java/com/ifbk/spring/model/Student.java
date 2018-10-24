package com.ifbk.spring.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity 
public class Student implements Serializable {
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;
	   
		   public void setAge(Integer age) {
		      this.age = age;
		   }
		   public Integer getAge() {
		      return age;
		   }
		   public void setName(String name) {
		      this.name = name;
		   }
		   public String getName() {
		      return name;
		   }
		   public void setId(Integer id) {
		      this.id = id;
		   }
		   public Integer getId() {
		      return id;
		   }
		
}
