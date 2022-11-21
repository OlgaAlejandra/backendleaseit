package com.leaseit.leasing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leaseit.leasing.entities.Operation;

public interface OperacionRepository extends JpaRepository<Operation, Long>{

}
