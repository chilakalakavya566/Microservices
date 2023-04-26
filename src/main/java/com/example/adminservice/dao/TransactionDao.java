package com.example.adminservice.dao;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.TransactionDetails;
@Repository
public interface TransactionDao extends JpaRepository<TransactionDetails,String> {
	@Query("from TransactionDetails u where u.account_number=?1")
	public List<TransactionDetails> searchByAccountNumber(String account_number);
}
