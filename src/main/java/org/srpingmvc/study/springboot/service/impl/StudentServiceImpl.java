package org.srpingmvc.study.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.srpingmvc.study.springboot.dao.IStudentDao;
import org.srpingmvc.study.springboot.domain.Student;
import org.srpingmvc.study.springboot.service.IStudentService;


@Transactional(readOnly=true)
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao; 

	public List<Student> findAll() {
		return studentDao.findAll();
	}
		
	public Student findById(String id) {
		return studentDao.findById(id);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(String id){
		studentDao.delete(id);
	}

}
