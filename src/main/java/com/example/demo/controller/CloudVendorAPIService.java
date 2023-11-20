package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/getcloudvendor")
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
}
