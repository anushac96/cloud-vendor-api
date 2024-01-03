package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{verdorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("verdorId") String vendorId) {	
		return cloudVendorService.getcloudVendor(vendorId);
	}
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {	
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVedor(cloudVendor);
		return "Cloud Vendor created!!!";		
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor updated!!!";
	}
	
	@DeleteMapping("vendorId")
	public String deleteCloudVendorDetail(@PathVariable("verdorId") String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud vendor deleted";
	}
}
