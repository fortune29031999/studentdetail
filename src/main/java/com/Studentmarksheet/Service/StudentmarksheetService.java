package com.Studentmarksheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Studentmarksheet.Dao.StudentmarksheetDao;
import com.Studentmarksheet.Entity.StudentmarksheetEntity;

@Service
public class StudentmarksheetService {
	@Autowired
	StudentmarksheetDao studentmarksheetdao;

	public String geter(List<StudentmarksheetEntity> a) {
		for (StudentmarksheetEntity x : a) {
			x.setSem1_total(x.getSem1_practical() + x.getSem1_theory());
			x.setSem2_total(x.getSem2_practical() + x.getSem2_theory());
		}
		return studentmarksheetdao.geter(a);
	}

	public List<StudentmarksheetEntity> getting() {
		return studentmarksheetdao.getting();
	}

}
