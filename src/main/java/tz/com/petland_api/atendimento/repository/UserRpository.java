package tz.com.petland_api.atendimento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import tz.com.petland_api.atendimento.model.entity.Users;

@Repository
public interface UserRpository extends JpaRepository<Users,String>{
    UserDetails findByLogin(String login);
}
