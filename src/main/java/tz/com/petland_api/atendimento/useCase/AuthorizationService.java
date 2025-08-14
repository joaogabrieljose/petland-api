package tz.com.petland_api.atendimento.useCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tz.com.petland_api.atendimento.repository.UserRpository;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    private UserRpository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
    
}
