package com.example.userservice.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ADMIN-SERVICE/admin")
public interface AdminProxy {
	@PostMapping("/applyloan")
	public LoansDto applyForLoan(@RequestBody LoansDto loan);
}
