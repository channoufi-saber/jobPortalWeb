package com.channoufi.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.channoufi.jobportal.entity.UsersType;
import com.channoufi.jobportal.repository.UsersTypeRepository;

@Service
public class UsersTypeService {

	private final UsersTypeRepository usersTypeRepository;

	public UsersTypeService(UsersTypeRepository usersTypeRepository) {
		super();
		this.usersTypeRepository = usersTypeRepository;
	}
	
	public List<UsersType> getAll() {
		return usersTypeRepository.findAll();
	}
}
