package com.studio_projektowe.communicator.services;

import com.studio_projektowe.communicator.entities.AppUser;
import com.studio_projektowe.communicator.repositories.AppUserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private AppUserRepository appUserRepository;

	public UserDetailsServiceImpl(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser = appUserRepository.findByUsername(username);
		if (appUser == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(appUser.getUsername(), appUser.getPassword(), emptyList());
	}
}
