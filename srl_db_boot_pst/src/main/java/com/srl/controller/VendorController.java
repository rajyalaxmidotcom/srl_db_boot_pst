package com.srl.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.srl.entity.Vendor;
import com.srl.Service.vendorService;
@RestController
public class VendorController {
	@Autowired
	com.srl.Service.vendorService vendorService;

	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor mypostBody) {
		System.out.println(mypostBody);
		return vendorService.createVendor(mypostBody);
	}
	
	@RequestMapping("/vendor/search")
	public List<Vendor> searchByCompany(@RequestParam String company){
return vendorService.searchByCompanyName(company);
}
	@RequestMapping("/vendor/lookup{gstNo}")
	public List<Vendor> searchVendorByGST(@PathVariable("gstNo") String GSTNo){
return vendorService.lookupVendorByGST(GSTNo);
}
	@RequestMapping("/vendor")
	public List<Vendor> getVendors(){
		return vendorService.readAllVendors();
	}	

	@RequestMapping("/vendor/{vendorCode}")
	
	  public Vendor getVendorById(@PathVariable("vendorCode") Long code) { 
	  Optional<Vendor> searchResult = vendorService.getSingleVendor(code);
	  if(!searchResult.isPresent()) {
		  return new Vendor((long)0,"","","","","","",null);
	  }
	  return searchResult.get();}
	 
	
	@RequestMapping(method=RequestMethod.PUT, value="/vendor")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorService.changeVendor(vendor);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/vendor/{id}")
	public String removeVendor(@PathVariable("id") Long Id) {
		return vendorService.deleteVendor(Id);
	}}
		
	

