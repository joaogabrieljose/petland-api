package tz.com.petland_api.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tz.com.petland_api.atendimento.model.dto.AuthenticationDTO;
import tz.com.petland_api.atendimento.model.dto.RegisterDTO;
import tz.com.petland_api.atendimento.model.entity.Users;
import tz.com.petland_api.atendimento.repository.UserRpository;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRpository userRpository;
    

    public ResponseEntity<Object> login(@RequestBody @Valid AuthenticationDTO dto){

        var usenamePassword = new UsernamePasswordAuthenticationToken(dto.login(), dto.password());

        var auth = authenticationManager.authenticate(usenamePassword);
        
        return ResponseEntity.ok().build();

    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO registerDTO){

        if(this.userRpository.findByLogin(registerDTO.login())!= null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
        Users newUser = new Users(registerDTO.login(), encryptedPassword, registerDTO.role());
        this.userRpository.save(newUser);

        return ResponseEntity.ok().build();
}
