package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.FacultiesInfo;
import com.nt.repo.IFacultyRepo;
@Service
public class ServiceImpl implements IServiceMgmt {

	@Autowired
	private IFacultyRepo repo;
	
	@Override
	public Iterable<FacultiesInfo> getAllFaculties() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
