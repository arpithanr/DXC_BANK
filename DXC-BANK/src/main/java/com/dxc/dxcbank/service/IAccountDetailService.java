package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.AccountDetails;

public interface IAccountDetailService {

    AccountDetails addDetails(AccountDetails accountDetails);
    AccountDetails updateDetails(AccountDetails accountDetails);
}
