package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.FixedDepositAccount;

public interface IFixedDepositService {

    FixedDepositAccount depositAmount(FixedDepositAccount fixedDeposit);

    FixedDepositAccount witdrawAmount(FixedDepositAccount fixedDeposit);
}
