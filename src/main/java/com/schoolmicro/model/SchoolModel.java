package com.schoolmicro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="School_Micro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolModel {
	
	
	@Id
	private Long schoolId;	
	private String schoolName;
	private String schoolLocation;
	private String SchoolType;
	private String SchoolRanking;
	
}
