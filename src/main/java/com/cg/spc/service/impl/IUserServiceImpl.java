package com.cg.spc.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.User;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.repository.IUserRepository;
import com.cg.spc.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User signIn(User user) {
		// TODO Auto-generated method stub
		User userNow = userRepository.findByUserName(user.getUserName());

		if (user.getPassword().equals(userNow.getPassword())) {
			return userNow;
		}
		
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		User userNow = userRepository.findByUserName(user.getUserName());

		if (user.getPassword().equals(userNow.getPassword())) {
			return userNow;
		}
		return null;
	}

}
