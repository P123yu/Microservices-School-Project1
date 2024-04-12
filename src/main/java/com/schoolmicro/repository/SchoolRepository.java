package com.schoolmicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolmicro.model.SchoolModel;

public interface SchoolRepository extends JpaRepository<SchoolModel,Long>{

}
