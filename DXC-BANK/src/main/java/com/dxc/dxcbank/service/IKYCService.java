package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.KYCDetails;
import com.dxc.dxcbank.exception.KYCDetailsNotCorrectException;

public interface IKYCService {

    KYCDetails addKYCDetails(KYCDetails detailsKYC) throws KYCDetailsNotCorrectException;

    KYCDetails updateKYCDetails(KYCDetails detailsKYC) throws KYCDetailsNotCorrectException;

}
