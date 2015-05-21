package org.srpingmvc.study.springboot.dao;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.srpingmvc.study.springboot.domain.Discline;

public interface IDisclineDao extends Repository<Discline, String>{

	public Discline findByZhuanyefangxiang(String Zhuanyefangxiang);

	public List<Discline> findAll();
	
	public void delete(String id);
}
