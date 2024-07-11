package com.srl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srl.Service.addressService;
import com.srl.entity.address;
@CrossOrigin(origins = "http://localhost:8073")
@RestController
public class addressController {
	@Autowired
	addressService addSrv;
	
	@RequestMapping("/addressess")
	public  List<address> getAddress(){
		return addSrv.getAddress();}
	
	@PostMapping("/addressess")
	public address createAddress(@RequestBody address payload) {
		return addSrv.createAddress(payload);
}}
