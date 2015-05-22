package org.srpingmvc.study.springboot.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.srpingmvc.study.springboot.domain.Discline;
import org.srpingmvc.study.springboot.domain.Student;
import org.srpingmvc.study.springboot.service.IDisclineService;
import org.srpingmvc.study.springboot.service.IStudentService;

@Controller
public class Controller1 {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private IDisclineService disclineService;
	
	@RequestMapping("/")
	public String userManager(){
		return "index.html";
	}
	@RequestMapping("/loadStudentList")
	@ResponseBody
	public List<Student>loadStudentList(){
	    List<Student> stuList = studentService.findAll();
		return stuList;
	}
	@RequestMapping("/loadDisclineList")
	@ResponseBody
	public List<Discline> loadDisclineList(){
		List<Discline> disList = disclineService.findAll();
		return disList;
	}
	@RequestMapping("/admitEditDiscline")
	public String admitEditDiscline(@RequestParam("profession") String profession,@RequestParam("induction")String induction,@RequestParam("teachPlan")String teachPlan,@RequestParam(value="teachers",defaultValue="{}")String[] teachers,@RequestParam("praticeBase")String praticeBase){
		System.out.println(profession + "," + induction + "," + teachPlan + "," + praticeBase);
		for(String str : teachers){
			System.out.println(str);
		}
		
		return "redirect:/";
	}
	@RequestMapping("/admitEditStudent")
	public String admitEditStudent(@RequestParam("id")String id,@RequestParam("zhuanyefangxiang")String zhuanyefangxiang){
		System.out.println("id:"+id+","+"zhuanyefangxiang:"+zhuanyefangxiang);
		return "redirect:/";
	}
	@RequestMapping("/loadAllTeachers")
	@ResponseBody
	public List<String> loadAllTeachers(){
		List<String> teachers = new ArrayList<String>();
		teachers.add("teacher1");
		teachers.add("teacher2");
		teachers.add("teacher3");
		teachers.add("teacher4");
		teachers.add("other");
		return teachers;
	}
	@RequestMapping("/loadAllProfession")
	@ResponseBody
	public List<String> loadAllProfession(){
		List<Discline>disList = disclineService.findAll();
		List<String> professions = new ArrayList<String>();
		for(Discline dis : disList){
			professions.add(dis.getZhuanyefangxiang());
		}
		return professions;
	}
	@RequestMapping("/student-{studentId}")
	@ResponseBody
	public Student loadStudent(@PathVariable("studentId") String studentId){
		Student student = studentService.findById(studentId);
		System.out.println(student);
		return student;
	}
	@RequestMapping("/student-{studentId}/delete")
	public String userDelete(@PathVariable("studentId") String studentId){
		studentService.delete(studentId);
		return "redirect:/";
	}
	@RequestMapping(value="/uploadFile", method=RequestMethod.POST)
	@ResponseBody
    public String handleFileUpload(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(name)));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + "!";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }
}
