package com.dxc.dxcbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.ServiceProviders;
import com.dxc.dxcbank.exception.ServiceProviderNotFoundException;
import com.dxc.dxcbank.repository.IServiceProviderRepository;

@Service
public class ServiceProviderService implements IServiceProviderService {

    @Autowired
    private IServiceProviderRepository iServiceProviderRepository;

    @Override
    public ServiceProviders addServiceProvider(ServiceProviders serviceProviders) {
	return iServiceProviderRepository.save(serviceProviders);
    }

    @Override
    public List<ServiceProviders> getAllService() {
	return iServiceProviderRepository.findAll();
    }

    @Override
    public ResponseEntity<ServiceProviders> deleteServiceProvider(int serviceProviderID) {
	ServiceProviders existingserviceProviders = this.iServiceProviderRepository.findById(serviceProviderID)
		.orElseThrow(() -> new ServiceProviderNotFoundException(serviceProviderID));
	this.iServiceProviderRepository.delete(existingserviceProviders);
	return ResponseEntity.ok().build();
    }

}
