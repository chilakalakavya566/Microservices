package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account,String>{

}
