package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.FacultiesInfo;
import com.nt.service.IServiceMgmt;

@Controller
public class InstituteController {
	@Autowired
	private IServiceMgmt service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "homePageDef";
	}
	@GetMapping("/faculties")
	public String showFaculties(Map<String, Object> map)
	{
		Iterable<FacultiesInfo> faculties = service.getAllFaculties();
		map.put("facultiesList", faculties);
		return "facultiesPageDef";
	}
	@GetMapping("/courses")
	public String showCourses()
	{
		
		return "coursesPageDef";
	}
	@GetMapping("/trainingmodes")
	public String showTraining()
	{
		
		return "trainingmodePageDef";
	}
	

}
