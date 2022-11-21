package com.leaseit.leasing.repository;

import com.leaseit.leasing.entities.Arrendador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrendadorRepository  extends JpaRepository<Arrendador,Long> {
}
