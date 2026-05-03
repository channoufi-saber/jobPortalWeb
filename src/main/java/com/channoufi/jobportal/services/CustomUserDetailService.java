package com.channoufi.jobportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.channoufi.jobportal.entity.Users;
import com.channoufi.jobportal.repository.UsersRepository;
import com.channoufi.jobportal.util.CustomUserDetails;


@Service
public class CustomUserDetailService implements UserDetailsService {
	
	private final UsersRepository usersRepository;
	
	
	@Autowired
	public CustomUserDetailService(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user =usersRepository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("Could not found user"));
		return new CustomUserDetails(user);
	}

}
