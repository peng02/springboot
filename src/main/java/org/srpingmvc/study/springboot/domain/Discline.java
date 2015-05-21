package org.srpingmvc.study.springboot.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "discline", catalog = "manager")
public class Discline implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String zhuanyefangxiang;
	private String fangxiangjieshao;
	private String jiaoxuejihua;
	private String shizituandui;
	private String shixijidi;
	private Set<Student> students;
	
	@Id
	@Column(name = "zhuanyefangxiang", insertable = true, updatable = true)
	public String getZhuanyefangxiang() {
		return zhuanyefangxiang;
	}
	public void setZhuanyefangxiang(String zhuanyefangxiang) {
		this.zhuanyefangxiang = zhuanyefangxiang;
	}
	
	@OneToMany
	@JoinColumn(name="zhuanyefangxiang")
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Discline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Discline(String zhuanyefangxiang, String fangxiangjieshao,
			String jiaoxuejihua, String shizituandui, String shixijidi) {
		super();
		this.zhuanyefangxiang = zhuanyefangxiang;
		this.fangxiangjieshao = fangxiangjieshao;
		this.jiaoxuejihua = jiaoxuejihua;
		this.shizituandui = shizituandui;
		this.shixijidi = shixijidi;
	}
	@Override
	public String toString() {
		return "Discline [zhuanyefangxiang=" + zhuanyefangxiang
				+ ", fangxiangjieshao=" + fangxiangjieshao + ", jiaoxuejihua="
				+ jiaoxuejihua + ", shizituandui=" + shizituandui
				+ ", shixijidi=" + shixijidi + "]";
	}

	@Column(name = "fangxiangjieshao")
	public String getFangxiangjieshao() {
		return fangxiangjieshao;
	}
	public void setFangxiangjieshao(String fangxiangjieshao) {
		this.fangxiangjieshao = fangxiangjieshao;
	}
	@Column(name = "jiaoxuejihua")
	public String getJiaoxuejihua() {
		return jiaoxuejihua;
	}
	public void setJiaoxuejihua(String jiaoxuejihua) {
		this.jiaoxuejihua = jiaoxuejihua;
	}
	@Column(name = "shizituandui")
	public String getShizituandui() {
		return shizituandui;
	}
	public void setShizituandui(String shizituandui) {
		this.shizituandui = shizituandui;
	}
	@Column(name = "shixijidi")
	public String getShixijidi() {
		return shixijidi;
	}
	public void setShixijidi(String shixijidi) {
		this.shixijidi = shixijidi;
	}
	
}
