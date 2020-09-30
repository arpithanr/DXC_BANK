package com.dxc.dxcbank.service;

import java.util.Optional;

import com.dxc.dxcbank.entities.CustomerLogin;

public interface ILoginService {

    CustomerLogin addCustomerLoginDetails(CustomerLogin customerLogin);

    Optional<CustomerLogin> getLoginDetailsByUsername(String username);

}
