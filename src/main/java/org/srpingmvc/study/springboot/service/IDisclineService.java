package org.srpingmvc.study.springboot.service;

import java.util.List;

import org.srpingmvc.study.springboot.domain.Discline;

public interface IDisclineService {

	public List<Discline>  findAll();
	
	public Discline findByZhuanyefangxiang(String zhuanyefangxiang);
	
	public void delete(String id);
}
