package com.dxc.dxcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.dxcbank.entities.ServiceProviders;

@Repository
public interface IServiceProviderRepository extends JpaRepository<ServiceProviders, Integer> {

}
