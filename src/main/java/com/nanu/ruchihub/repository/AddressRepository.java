package com.nanu.ruchihub.repository;

import com.nanu.ruchihub.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
