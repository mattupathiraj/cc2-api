package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.patiententity;
public interface patientrepo extends JpaRepository<patiententity,Integer>{

}