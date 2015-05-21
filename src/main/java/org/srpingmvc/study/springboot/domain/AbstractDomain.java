package org.srpingmvc.study.springboot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class AbstractDomain implements Serializable{

	
	private static final long serialVersionUID = 1L;

	String id;
	
	@Id
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@GeneratedValue(generator="system-uuid")
	@Column(name = "id", insertable = true, updatable = true)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
