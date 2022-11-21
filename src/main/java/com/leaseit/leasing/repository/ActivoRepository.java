package com.leaseit.leasing.repository;

import com.leaseit.leasing.entities.Activo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivoRepository  extends JpaRepository<Activo,Long> {
}
