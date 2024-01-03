package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVedor(CloudVendor cloudVendor);
	
	public String updateCloudVendor(CloudVendor cloudVendor);
	
	public String deleteCloudVendor(String cloudVendorId);
	
	public CloudVendor getcloudVendor(String cloudVendorId);
	
	public List<CloudVendor> getAllCloudVendors();
}

