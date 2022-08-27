package com.jwtauth.api.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(username.equals("pranita"))
		{
			return new User("pranita", "pranita123", new ArrayList<>());
		}
		else
		{
			throw new UsernameNotFoundException("User not found");
		}
			
		
		
	}

}
