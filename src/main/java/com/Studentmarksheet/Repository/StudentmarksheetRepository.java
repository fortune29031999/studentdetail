package com.Studentmarksheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Studentmarksheet.Entity.StudentmarksheetEntity;

public interface StudentmarksheetRepository extends JpaRepository<StudentmarksheetEntity, Integer> {

}