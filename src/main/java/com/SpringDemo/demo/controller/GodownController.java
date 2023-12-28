package com.SpringDemo.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringDemo.demo.model.Godown;
import com.SpringDemo.demo.services.Godownservicess;

@RestController
@RequestMapping("/api/godown")
public class GodownController {
	
	
	private Godownservicess godownServicess;
	
	

	public GodownController(Godownservicess godownServicess) {
		super();
		this.godownServicess = godownServicess;
	}

	// create rest apis for godown
	
	@PostMapping()
	public ResponseEntity<Godown> saveGodown(@RequestBody Godown godown){
		return new ResponseEntity<Godown>(godownServicess.saveGodown(godown), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Godown> getAllGodowns(){
		return godownServicess.getAllgodownss();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Godown> updateGodownById(@PathVariable("id") int id, @RequestBody Godown godown){
		return new ResponseEntity<Godown>(godownServicess.updateGodownn(godown, id), HttpStatus.OK);
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Godown>getGodownBtId(@PathVariable("id") int id){
		return new ResponseEntity<Godown>(godownServicess.getGodownByIdd(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteGodown(@PathVariable("id") int id){
		godownServicess.deletegodownById(id);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	

}

