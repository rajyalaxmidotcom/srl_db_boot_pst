package com.srl.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srl.entity.Vendor;
@Component
public class vendorService {
	private static final Long Id = null;
	@Autowired
	IVendorPersistence vendor;
	
public List<Vendor> readAllVendors(){
	return vendor.findAll();}
/*
 * public Vendor getSingleVendorById(String vendorcode) {
 * return(Vendor)vendors.get(vendorcode);}
 * 
 * public Vendor changeVendor(Vendor vendor) { return vendor;}
 */
	public Vendor createVendor(Vendor vendorObj) {
		return vendor.save(vendorObj);
		}	

		/*
		 * public List <Vendor> searchBycompanyName(String companyName){ return
		 * vendor.findByCompanyName(companyName); }
		 */
	public List<Vendor> searchByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return vendor.findByCompanyName(companyName);
	}
	public List<Vendor> lookupVendorByGST(String GSTo){
		return vendor.lookupVendorByGST(GSTo);}
	
	
	public Optional<Vendor> getSingleVendor(Long id) {
		
		// TODO Auto-generated method stub
		return vendor.findById(id);
	}
	public Vendor changeVendor(Vendor payload) {
		// TODO Auto-generated method stub
		 Optional<Vendor> myvendor = vendor.findById(payload.getId());
		 if(!myvendor.isPresent()) {
			  return new Vendor((long)0,"","","","","","",null);
		 
	}
		 return vendor.save(payload);}
	public String deleteVendor(Long Id) {
		vendor.deleteById(Id);
		return "Deleted Successfully";
		
	}
}
	

		

		


		



