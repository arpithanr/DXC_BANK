package com.dxc.dxcbank.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.KYCDetails;
import com.dxc.dxcbank.exception.KYCDetailsNotCorrectException;
import com.dxc.dxcbank.repository.IKYCRepository;

@Service
public class KYCService implements IKYCService {

    @Autowired
    private IKYCRepository repositoryKYC;

    @Override
    public KYCDetails addKYCDetails(KYCDetails detailsKYC) throws KYCDetailsNotCorrectException {
	KYCDetails isValid = validateKYCDetails(detailsKYC);

	if (isValid != null) {
	    return repositoryKYC.save(detailsKYC);
	} else {
	    throw new KYCDetailsNotCorrectException("Invalid KYC Details..");
	}
    }

    @Override
    public KYCDetails updateKYCDetails(KYCDetails detailsKYC) throws KYCDetailsNotCorrectException {
	KYCDetails isValid = validateKYCDetails(detailsKYC);

	if (isValid != null) {
	    return repositoryKYC.save(detailsKYC);
	} else {
	    throw new KYCDetailsNotCorrectException("Invalid KYC Details..");
	}
    }

    // Validating KYC Details
    private KYCDetails validateKYCDetails(KYCDetails detailsKYC) {

    String cardPANNumber= detailsKYC.getCardPANNumber().toUpperCase();
	Pattern pattern = Pattern.compile("[A-Z0-9]*");
	Matcher matcher = pattern.matcher(cardPANNumber);

	if ((detailsKYC.getAadhaarNumber() >= 100000000000L && detailsKYC.getAadhaarNumber() <= 999999999999L)
		&& (detailsKYC.getCardPANNumber() != null && matcher.matches())
		&& (detailsKYC.getContactNumber() >= 1000000000L && detailsKYC.getContactNumber() <= 9999999999L)
		&& detailsKYC.getCustomerName() != null) {

	    return detailsKYC;
	}
	return null;
    }

}

