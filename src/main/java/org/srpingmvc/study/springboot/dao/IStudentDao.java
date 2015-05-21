package org.srpingmvc.study.springboot.dao;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.srpingmvc.study.springboot.domain.Student;

public interface IStudentDao extends Repository<Student, String>{

	// @Query(value="SELECT * FROM user WHERE id = ?1", nativeQuery = true)
	public Student findById(String id);

	// @Query(value="SELECT * FROM user", nativeQuery = true)
	public List<Student> findAll();
	
//	@Query(value="DELETE FROM User u where u.id = ?1")
	public void delete(String id);
}
