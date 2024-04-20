package com.Studentmarksheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Studentmarksheet.Entity.StudentmarksheetEntity;
import com.Studentmarksheet.Service.StudentmarksheetService;

@RestController

public class StudentmarksheetController {
	@Autowired
	StudentmarksheetService studentmarksheetservice;

	@PostMapping(value = "/insertt")
	public String geter(@RequestBody List<StudentmarksheetEntity> a) {
		return studentmarksheetservice.geter(a);
	}

	@GetMapping("/get")
	public List<StudentmarksheetEntity> getting() {
		return studentmarksheetservice.getting();
	}
}
