package com.lifeinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer>{

}
