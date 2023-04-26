package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Loans;
@Repository
public interface LoansDao extends JpaRepository<Loans, String> {

}
