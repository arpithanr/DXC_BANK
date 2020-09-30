package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.WifiBillPayment;
import com.dxc.dxcbank.repository.IWiFiBillPaymentRepository;

@Service
public class WifiBillService implements IWifiBillService {

    @Autowired
    IWiFiBillPaymentRepository wifiRepository;
    
    @Override
    public WifiBillPayment addBill(WifiBillPayment wifibill) {
	return wifiRepository.save(wifibill);
    }

}
