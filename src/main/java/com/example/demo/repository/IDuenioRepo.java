package com.example.demo.repository;

import com.example.demo.model.DuenioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepo extends JpaRepository<DuenioModel, Long> {
}
