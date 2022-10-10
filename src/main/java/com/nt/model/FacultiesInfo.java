package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="info_faculties")
public class FacultiesInfo {
	
	@Id
	@GeneratedValue
	private Integer facultyId;
	private String facultyName;
	private String facultyQlfy;
	private String facultySubject;

}
