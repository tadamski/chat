package com.studio_projektowe.communicator.repositories;

import com.studio_projektowe.communicator.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
    AppUser findByEmail(String email);
}
