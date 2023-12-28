package com.SpringDemo.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringDemo.demo.exceptions.ResourceNotFoundException;
import com.SpringDemo.demo.model.Godown;
import com.SpringDemo.demo.repository.GodownRepository;
import com.SpringDemo.demo.services.Godownservicess;

@Service
public class GodownServiceImp implements Godownservicess {

	private GodownRepository godownRepository;
	
	public GodownServiceImp(GodownRepository godownRepository) {
		super();
		this.godownRepository = godownRepository;
	}


	@Override
	public Godown saveGodown(Godown godown) {
		return godownRepository.save(godown);
	}


	@Override
	public List<Godown> getAllgodownss() {
		return godownRepository.findAll();
	}


	@Override
	public Godown getGodownByIdd(int id) {
	Optional<Godown> godown = godownRepository.findById(id);
//		 if(godown.isPresent()) {
//			 return godown.get();
//			 }else {
//				 throw new ResourceNotFoundException("godown", "id", godown);
//			 }
		return godownRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("godown", "id", godown));
	}


	@Override
	public Godown updateGodownn(Godown godown, int id) {
		
		Godown existingGodown = godownRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("godown", "id", godown));
		
		existingGodown.setName(godown.getName());
		existingGodown.setCode(godown.getCode());
		existingGodown.setDescription(godown.getDescription());
		godownRepository.save(existingGodown);
		
		return existingGodown;
	}


	@Override
	public void deletegodownById(int id) {
		godownRepository.deleteById(id);
		
	}


	
	
	
	
	
}
