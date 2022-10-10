package com.nt.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.FacultiesInfo;

public interface IFacultyRepo extends PagingAndSortingRepository<FacultiesInfo, Integer> {

}
