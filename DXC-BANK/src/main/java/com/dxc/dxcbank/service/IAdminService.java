package com.dxc.dxcbank.service;

import org.springframework.http.ResponseEntity;

import com.dxc.dxcbank.entities.AdminResponsibility;

public interface IAdminService {

    AdminResponsibility addRequest(AdminResponsibility adminResponsibility);

    AdminResponsibility updateRequest(AdminResponsibility adminResponsibility);

    ResponseEntity<?> deleteRequest(int userId);
}
