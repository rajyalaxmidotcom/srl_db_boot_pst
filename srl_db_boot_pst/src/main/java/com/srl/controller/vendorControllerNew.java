package com.srl.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.srl.entity.Vendor;
@RepositoryRestResource(collectionResourceRel="vendor",path="newVendor")

public interface vendorControllerNew extends JpaRepository<Vendor, Long>{

}
