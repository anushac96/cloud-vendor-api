package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{verdorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {	
		return cloudVendor;
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor created!!!";		
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor updated!!!";
	}
	
	@DeleteMapping("vendorId")
	public String deleteCloudVendorDetail(String vendorId) {
		this.cloudVendor = null;
		return "Cloud vendor deleted";
	}
}
