package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.AdminResponsibility;
import com.dxc.dxcbank.exception.UserIdNotFoundException;
import com.dxc.dxcbank.repository.IAdminRepository;

@Service
public class AdminService implements IAdminService {

    @Autowired
    IAdminRepository iAdminRepository;

    @Override
    public AdminResponsibility addRequest(AdminResponsibility adminResponsibility) {
	return iAdminRepository.save(adminResponsibility);
    }

    @Override
    public AdminResponsibility updateRequest(AdminResponsibility adminResponsibility) {
	return iAdminRepository.save(adminResponsibility);
    }

    @Override
    public ResponseEntity<AdminResponsibility> deleteRequest(int userId) {
	AdminResponsibility adminResponsibility = this.iAdminRepository.findById(userId)
		.orElseThrow(() -> new UserIdNotFoundException(userId));
	this.iAdminRepository.delete(adminResponsibility);
	return ResponseEntity.ok().build();
    }

}
