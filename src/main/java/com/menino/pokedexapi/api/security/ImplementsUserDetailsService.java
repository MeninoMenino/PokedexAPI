package com.menino.pokedexapi.api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.menino.pokedexapi.domain.model.User;
import com.menino.pokedexapi.domain.repository.UserRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User usuario = usuarioRepository.findByEmail(email);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado");
		} else {
			return usuario;
		}
	}

}
