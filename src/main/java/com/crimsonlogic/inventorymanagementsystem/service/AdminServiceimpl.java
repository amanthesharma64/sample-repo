package com.crimsonlogic.inventorymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;

@Service
public class AdminServiceimpl implements IAdminService{
	
	@Autowired
	private IAdminRepository admRepo;

}
