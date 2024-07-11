package com.srl.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srl.entity.Vendor;
import com.srl.entity.address;

public interface IAddressPersistence extends JpaRepository<address,Long >{
	// List <Vendor> findByCompanyName(String companyName); {

}
