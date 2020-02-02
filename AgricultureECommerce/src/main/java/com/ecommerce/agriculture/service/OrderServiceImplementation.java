package com.ecommerce.agriculture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.agriculture.entity.Order;
import com.ecommerce.agriculture.repository.OrderRepository;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Service
public class OrderServiceImplementation implements OrderService {

	private OrderRepository orderRepository;

	@Autowired   
	public OrderServiceImplementation( OrderRepository obj)
	{
		orderRepository=obj;
	}
	
	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public void save(Order admin)
	{
		
		orderRepository.save(admin);
	}
	@Override
	public void deleteById(int theId) {
		
		 orderRepository.deleteById(theId);
	}

	@Override
	public Order findById(int id) {
		
		return orderRepository.findById(id);
	}

	
}
