package com.SpringDemo.demo.services;

import java.util.List;

import com.SpringDemo.demo.model.Godown;

public interface Godownservicess {
	  
	Godown saveGodown(Godown godown);
	List<Godown> getAllgodownss();
	Godown getGodownByIdd(int id);
	Godown updateGodownn(Godown godown, int id);
	void deletegodownById(int id);
}
