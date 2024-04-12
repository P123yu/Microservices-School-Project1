package com.schoolmicro.service;

import org.springframework.stereotype.Service;

import com.schoolmicro.model.SchoolModel;


@Service
public interface SchoolService {
	
	SchoolModel getBySchoolId(Long schoolId);
	SchoolModel insert(SchoolModel schoolModel);

}
