package com.ecommerce.agriculture.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.agriculture.entity.Seller;
import com.ecommerce.agriculture.repository.UserRepository;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Service("userService")
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Seller findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public Seller findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}
	
	public void saveUser(Seller user) {
		userRepository.save(user);
	}
	
	public List<Seller> findAll() {
		
		return userRepository.findAll();
	}

}