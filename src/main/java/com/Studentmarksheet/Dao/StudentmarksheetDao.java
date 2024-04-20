package com.Studentmarksheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Studentmarksheet.Entity.StudentmarksheetEntity;
import com.Studentmarksheet.Repository.StudentmarksheetRepository;

@Repository
public class StudentmarksheetDao {

	@Autowired
	StudentmarksheetRepository studentmarksheetrepository;

	public String geter(List<StudentmarksheetEntity> a) {
		studentmarksheetrepository.saveAll(a);
		return "saved";
	}

	public List<StudentmarksheetEntity> getting() {
		return studentmarksheetrepository.findAll();
	}
}
