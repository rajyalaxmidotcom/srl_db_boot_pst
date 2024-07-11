package com.srl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srl.entity.*;
@Component
public class addressService {
	
	@Autowired
IAddressPersistence address;
	
/*
 * public List<address> readAllAddresses(){ return address.findAll();}
 */
	
		public address createAddress(address payload) {
			return address.save(payload);
	}

		public List<address> getAddress() {
			// TODO Auto-generated method stub
			return address.findAll();
		}}

