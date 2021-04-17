package net.hrrbrt.tools.i18n.dope.repository;

import net.hrrbrt.tools.i18n.dope.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
