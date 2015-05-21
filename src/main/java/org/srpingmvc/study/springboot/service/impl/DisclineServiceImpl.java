package org.srpingmvc.study.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.srpingmvc.study.springboot.dao.IDisclineDao;
import org.srpingmvc.study.springboot.domain.Discline;
import org.srpingmvc.study.springboot.service.IDisclineService;


@Transactional(readOnly=true)
@Service
public class DisclineServiceImpl implements IDisclineService {

	@Autowired
	private IDisclineDao disclineDao; 

	public List<Discline> findAll() {
		return disclineDao.findAll();
	}

	
	public Discline findByZhuanyefangxiang(String Zhuanyefangxiang) {
		return disclineDao.findByZhuanyefangxiang(Zhuanyefangxiang);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(String id){
		disclineDao.delete(id);
	}

}
