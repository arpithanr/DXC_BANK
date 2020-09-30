package com.dxc.dxcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.KYCDetails;
import com.dxc.dxcbank.service.IKYCService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/kyc")
public class KYCController {

    @Autowired
    private IKYCService service;

    @PostMapping(path = "/addKYC", consumes = { "application/json" })
    public KYCDetails addKYCDetails(@RequestBody KYCDetails detailsKYC) {
	return service.addKYCDetails(detailsKYC);
    }

    @PostMapping(path = "/updateKYC", consumes = { "application/json" })
    public KYCDetails updateKYCDetails(@RequestBody KYCDetails detailsKYC) {
	return service.updateKYCDetails(detailsKYC);
    }

}
