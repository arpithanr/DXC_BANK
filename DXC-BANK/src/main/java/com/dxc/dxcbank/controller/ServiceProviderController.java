package com.dxc.dxcbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.ServiceProviders;
import com.dxc.dxcbank.service.IServiceProviderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class ServiceProviderController {

    @Autowired
    private IServiceProviderService serviceProviderService;

    @PostMapping(path = "/addServiceProvider", consumes = { "application/json" })
    public ServiceProviders addServiceProvider(@RequestBody ServiceProviders serviceProviders) {
	return serviceProviderService.addServiceProvider(serviceProviders);
    }

    @GetMapping(path = "/getAllService", produces = { "application/json" })
    public List<ServiceProviders> getAllService() {
	return serviceProviderService.getAllService();
    }

    @DeleteMapping(path = "/deleteServiceProvider/{serviceProviderID}")
    public ResponseEntity<?> deleteServiceProvider(@PathVariable("serviceProviderID") int serviceProviderID) {
	return serviceProviderService.deleteServiceProvider(serviceProviderID);
    }

}
