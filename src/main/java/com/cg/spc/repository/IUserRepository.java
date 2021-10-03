package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.User;
@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String username);

}
