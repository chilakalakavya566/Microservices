package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Branch;

@Repository
public interface BranchDao extends JpaRepository<Branch,String>{

}
