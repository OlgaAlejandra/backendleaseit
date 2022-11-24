package com.leaseit.leasing.controller;

import java.util.List;

import com.leaseit.leasing.entities.User;
import com.leaseit.leasing.exeption.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	 
	 @GetMapping("/operations")
	 public ResponseEntity<List<Operation>> getAllOperations(){
		 List<Operation> operaciones = operationRepository.findAll();
		 return new ResponseEntity<List<Operation>>(operaciones,HttpStatus.OK);
	 }
	@GetMapping("/operations/{id}")
	public ResponseEntity<Operation> getOperationId(@PathVariable("id") Long id){
		Operation operacion = operationRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Not found user with id="+id));;
		return new ResponseEntity<Operation>(operacion,HttpStatus.OK);
	}

	@PostMapping("/operations")
	public ResponseEntity<Operation> createOperation(@RequestBody Operation operacion){
		Operation newOperation= operationRepository.save(
				new Operation(
						operacion.getUser(),
						operacion.getActivo(),
						operacion.getArrendador(),
						operacion.isPgp_flag(),
						operacion.getPgp_count(),
						operacion.isPgt_flag(),
						operacion.getPgt_count(),
						operacion.getP_financiado(),
						operacion.getTiempo_o(),
						operacion.getFrecuencia(),
						operacion.getMoneda()
						));
		return new ResponseEntity<Operation>(newOperation,HttpStatus.CREATED);
	}
	 
}
