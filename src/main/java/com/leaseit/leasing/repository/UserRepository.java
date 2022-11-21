package com.leaseit.leasing.repository;

import com.leaseit.leasing.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
