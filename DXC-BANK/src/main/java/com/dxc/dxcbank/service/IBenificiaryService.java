package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.AccountDetails;

public interface IBenificiaryService {

    AccountDetails addBenificiaryDetails(AccountDetails accountDetails);

    AccountDetails updateBenificiaryDetails(AccountDetails accountDetails);
}
