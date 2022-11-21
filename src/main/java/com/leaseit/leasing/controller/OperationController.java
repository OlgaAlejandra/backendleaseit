package com.leaseit.leasing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaseit.leasing.entities.Operation;
import com.leaseit.leasing.repository.ActivoRepository;
import com.leaseit.leasing.repository.ArrendadorRepository;
import com.leaseit.leasing.repository.OperacionRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OperationController {

	 @Autowired
	 private OperacionRepository operationRepository;
	 @Autowired
	 private ArrendadorRepository arrendadorRepository;
	 @Autowired
	 private ActivoRepository activoRepository;
	 
	 @GetMapping("operacion")
	 public ResponseEntity<List<Operation>> getAllOperations(){
		 List<Operation> operaciones = operationRepository.findAll();
		 return new ResponseEntity<List<Operation>>(operaciones,HttpStatus.OK);
	 }
	 
}
