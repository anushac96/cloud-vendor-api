package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVedor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Updated";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Deleted";
	}

	@Override
	public CloudVendor getcloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
