package org.srpingmvc.study.springboot.service;

import java.util.List;

import org.srpingmvc.study.springboot.domain.Student;

public interface IStudentService {

	public List<Student>  findAll();
	
	public Student findById(String id);
	
	public void delete(String id);
	
}
