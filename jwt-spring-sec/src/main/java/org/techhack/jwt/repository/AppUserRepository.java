package org.techhack.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techhack.jwt.domain.AppUser;

/**
 * @author Samraj Timmapuram
 *
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
