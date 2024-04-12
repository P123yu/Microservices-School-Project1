package com.schoolmicro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolmicro.model.SchoolModel;
import com.schoolmicro.repository.SchoolRepository;



@Service
public class SchoolServiceImpl implements SchoolService{
	
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public SchoolModel getBySchoolId(Long schoolId) {
		SchoolModel school=schoolRepository.findById(schoolId).orElse(null);
		return school;
	}

	@Override
	public SchoolModel insert(SchoolModel schoolModel) {
		SchoolModel school=schoolRepository.save(schoolModel);
		return school;
		
	}

}
