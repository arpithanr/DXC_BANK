package com.dxc.dxcbank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.CustomerLogin;
import com.dxc.dxcbank.exception.UsernameNotFoundException;
import com.dxc.dxcbank.repository.ILoginRepository;

@Service
public class LoginService implements ILoginService {

    @Autowired 
    private ILoginRepository loginRepository;
    
    @Override
    public CustomerLogin addCustomerLoginDetails(CustomerLogin customerLogin) {
	return loginRepository.save(customerLogin);
    }

    @Override
    public Optional<CustomerLogin> getLoginDetailsByUsername(String username) {
	
	return Optional.of(loginRepository.findById(username)
		.orElseThrow(() -> new UsernameNotFoundException(username)));
    }

}
