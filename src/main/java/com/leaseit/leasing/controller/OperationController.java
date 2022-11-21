package com.leaseit.leasing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 
	 
}
