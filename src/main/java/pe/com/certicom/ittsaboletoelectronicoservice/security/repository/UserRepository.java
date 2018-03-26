package pe.com.certicom.ittsaboletoelectronicoservice.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.certicom.ittsaboletoelectronicoservice.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}

