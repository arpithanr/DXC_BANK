package com.dxc.dxcbank.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dxc.dxcbank.entities.ServiceProviders;

public interface IServiceProviderService {

    ServiceProviders addServiceProvider(ServiceProviders savingsAccount);

    List<ServiceProviders> getAllService();

    ResponseEntity<?> deleteServiceProvider(int serviceProviderID);

}
